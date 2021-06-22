package com.learn.MineMapper;

import com.learn.pojo.Customer;
import tk.mybatis.mapper.common.base.select.SelectAllMapper;
import tk.mybatis.mapper.common.example.SelectByExampleMapper;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/8/28 10:50<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
public interface MyMapper<T> extends
        SelectAllMapper<T>,
        SelectByExampleMapper<T>,
        MyBatchUpdateMapper{
}
