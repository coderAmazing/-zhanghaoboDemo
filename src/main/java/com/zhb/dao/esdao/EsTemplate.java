package com.zhb.dao.esdao;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.collections.CollectionUtils;
import org.elasticsearch.action.admin.indices.exists.indices.IndicesExistsRequest;
import org.elasticsearch.action.admin.indices.exists.types.TypesExistsRequest;
import org.elasticsearch.action.bulk.BulkRequestBuilder;
import org.elasticsearch.action.bulk.BulkResponse;
import org.elasticsearch.action.delete.DeleteRequestBuilder;
import org.elasticsearch.action.delete.DeleteResponse;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.support.WriteRequest;
import org.elasticsearch.action.update.UpdateRequestBuilder;
import org.elasticsearch.client.IndicesAdminClient;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.common.xcontent.XContentType;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.reindex.DeleteByQueryAction;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.aggregations.bucket.histogram.DateHistogramInterval;
import org.elasticsearch.search.sort.SortOrder;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by developer on 19-2-20.
 */
@Component
public class EsTemplate {

    private static final Logger logger = LoggerFactory.getLogger(EsTemplate.class);

    @Value("${spring.data.elasticsearch.cluster-name}")
    private String clusterName;

    @Value("${spring.data.elasticsearch.node-ip}")
    private String nodeIp;

    @Value("${spring.data.elasticsearch.node-port}")
    private int nodePort;

    private TransportClient client = null;
    private IndicesAdminClient adminClient;

    @PostConstruct
    public TransportClient getEsClient() {
        if (null == client) {
            logger.info("create ES client !!!!!");
            client = transportClient();
            adminClient = client.admin().indices();
        }
        return client;
    }

    @PreDestroy
    public void close() {
        if (null != client) {
            logger.info("close ES client !!!!!");
            client.close();
        }
    }

    public void addRecord(List records, String index, String esType, boolean refresh, boolean throwException) {
        if (CollectionUtils.isNotEmpty(records)) {
            BulkRequestBuilder bulkRequestBuilder = client.prepareBulk();
            records.forEach(record -> {
                IndexRequest indexRequest = new IndexRequest(index, esType);
                indexRequest.source(JSONObject.toJSONString(record), XContentType.JSON);
                bulkRequestBuilder.add(indexRequest);
            });
            execute(bulkRequestBuilder, throwException, refresh);
        }
    }

    public void delete(String index, String type, String id) {
        DeleteRequestBuilder del = client.prepareDelete();
        DeleteResponse response = del.setIndex(index).setType(type).setId(id).execute().actionGet();
        int status = response.status().getStatus();
        logger.info("delete with index: {}, type: {}, id: {} ", index, type, id);
    }

    public void delete(String index, QueryBuilder queryBuilder) {
        DeleteByQueryAction.INSTANCE.newRequestBuilder(client).filter(queryBuilder).source(index).get();
        logger.info("delete with index: {}, type: {}, id: {} ", index);
    }

    public void update(JSONObject obj, String index, String type, String id) {
        UpdateRequestBuilder u = client.prepareUpdate(index, type, id).setDoc(obj.toJSONString());
        u.execute().actionGet().status().getStatus();
        logger.info("update with index: {}, type: {}, id: {} ", index, type, id);
    }

    public JSONObject find(String index, String type, String id) {
        QueryBuilder q = QueryBuilders.idsQuery().addIds(id).types(type);
        List<JSONObject> list = this.findAll(index, type, q);
        if (CollectionUtils.isNotEmpty(list)) {
            return list.get(0);
        }
        return null;
    }

    public List<JSONObject> findAll(String index, String type, QueryBuilder queryBuilder) {
        if (!this.indexExists(index)) {
            return Collections.emptyList();
        }
        SearchRequestBuilder s = client.prepareSearch(index);
        if (null != type) {
            s.setTypes(type);
            if (!this.typeExists(index, type)) {
                return Collections.emptyList();
            }
        }
        if (null != queryBuilder) {
            s.setQuery(queryBuilder);
        }
        SearchResponse response = s.execute().actionGet();
        return responseToList(response);
    }

    public List<JSONObject> findAll(String index, String type, QueryBuilder queryBuilder ,String sort) {
        if (!this.indexExists(index)) {
            return Collections.emptyList();
        }
        SearchRequestBuilder s = client.prepareSearch(index);
        if (null != sort){
            s.addSort(sort ,SortOrder.ASC);
        }
        if (null != type) {
            s.setTypes(type);
            if (!this.typeExists(index, type)) {
                return Collections.emptyList();
            }
        }
        if (null != queryBuilder) {
            s.setQuery(queryBuilder);
        }
        SearchResponse response = s.execute().actionGet();
        return responseToList(response);
    }

    public void add(String index, String type, JSONObject json) {
        IndexResponse response = client.prepareIndex(index, type).setSource(json).execute().actionGet();
    }

    private List<JSONObject> responseToList(SearchResponse response) {
        SearchHit[] searchHits = response.getHits().getHits();
        List<JSONObject> list = new ArrayList<>(searchHits.length);
        for (SearchHit hit : searchHits) {
            JSONObject json = new JSONObject();
            json.put("_id", hit.getId());
            json.put("_index", hit.getIndex());
            json.put("_type", hit.getType());
            json.put("_source", hit.getSourceAsMap());
            list.add(json);
        }
        logger.info("get es doc size: {}", list.size());
        return list;
    }

    public boolean indexExists(String index) {
        IndicesExistsRequest request = new IndicesExistsRequest(index);
        return adminClient.exists(request).actionGet().isExists();
    }

    public boolean typeExists(String index, String type) {
        if (indexExists(index)) {
            TypesExistsRequest request = new TypesExistsRequest(new String[]{index}, type);
            return adminClient.typesExists(request).actionGet().isExists();
        } else {
            return false;
        }
    }

    private void execute(BulkRequestBuilder bulkRequest, boolean throwException, boolean refresh) {
        bulkRequest.setRefreshPolicy(WriteRequest.RefreshPolicy.IMMEDIATE);
        BulkResponse bulkItemResponses = bulkRequest.execute().actionGet();
        if (bulkItemResponses.hasFailures()) {
            if (throwException) {
                throw new IllegalArgumentException(bulkItemResponses.buildFailureMessage());
            } else {
                logger.error(bulkItemResponses.buildFailureMessage());
                logger.error("bulk failure message, lost size is {}", bulkItemResponses.getItems().length);
            }
        }
    }

    private TransportClient transportClient() {
        TransportClient client = null;
        logger.info("初始化 transportClient 开始。。。。。");
        try {
            TransportAddress transportAddress = new InetSocketTransportAddress(InetAddress.getByName(nodeIp), nodePort);
            // 配置信息
            Settings esSetting = Settings.builder().put("cluster.name", clusterName).build();
            //配置信息Settings自定义
            client = new PreBuiltTransportClient(esSetting);
            client.addTransportAddresses(transportAddress);
        } catch (Exception e) {
            logger.error("elasticsearch TransportClient create error!!!", e);
        }
        logger.info("初始化 transportClient end。。。。。");
        return client;
    }

    public DateHistogramInterval getInterVal(long interval) {
        if (interval / (24 * 60 * 60 * 1000) >= 1 && interval / (24 * 60 * 60 * 1000) < 7) {
            return DateHistogramInterval.DAY;
        } else return DateHistogramInterval.HOUR;
    }
}
