package com.learn.mapper;

import com.learn.MineMapper.MyMapper;
import com.learn.pojo.Customer;
import org.apache.ibatis.annotations.CacheNamespace;

@CacheNamespace
public interface CustomerMapper extends MyMapper<Customer> {

}