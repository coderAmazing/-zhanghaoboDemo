package com.zhb.dao.mysql;

import com.zhb.bean.customers.TCustomers;
import com.zhb.bean.customers.TCustomersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCustomersMapper {
    int countByExample(TCustomersExample example);

    int deleteByExample(TCustomersExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TCustomers record);

    int insertSelective(TCustomers record);

    List<TCustomers> selectByExample(TCustomersExample example);

    TCustomers selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TCustomers record, @Param("example") TCustomersExample example);

    int updateByExample(@Param("record") TCustomers record, @Param("example") TCustomersExample example);

    int updateByPrimaryKeySelective(TCustomers record);

    int updateByPrimaryKey(TCustomers record);
}