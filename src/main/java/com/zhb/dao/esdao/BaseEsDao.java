package com.zhb.dao.esdao;

import com.alibaba.fastjson.JSONObject;

import com.zhb.util.DateUtil;
import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.index.query.QueryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

/**
 * Created by developer on 19-2-25.
 */
@Component
public class BaseEsDao {

    public static final Logger logger = LoggerFactory.getLogger(BaseEsDao.class);

    @Autowired
    EsTemplate esTemplate;

    public void add(String index ,String type ,JSONObject json){
        esTemplate.add(index ,type ,json);
    }
    public void addRecord(List records, String index, String esType, boolean refresh, boolean throwException) {
        esTemplate.addRecord(records, index, esType, refresh, throwException);
    }

    public void delete(String index, String type, String id) {
        esTemplate.delete(index, type, id);
    }

    public void delete(String index, QueryBuilder queryBuilder) {
        esTemplate.delete(index, queryBuilder);
    }

    public void update(JSONObject obj, String index, String type, String id) {
        esTemplate.update(obj, index, type, id);
    }

    public JSONObject find(String index, String type, String id) {
        return esTemplate.find(index, type, id);
    }

    public List<JSONObject> find(String index, String type, QueryBuilder queryBuilder) {
        return esTemplate.findAll(index, type, queryBuilder);
    }

    public List<JSONObject> find(String index, String type, QueryBuilder queryBuilder ,String sort) {
        return esTemplate.findAll(index, type, queryBuilder ,sort);
    }

    public boolean indexExists(String index) {
        return esTemplate.indexExists(index);
    }

    public boolean typeExists(String index, String type) {
        return esTemplate.typeExists(index, type);
    }



}
