package com.learn.MineMapper;

import org.apache.ibatis.annotations.UpdateProvider;

import java.util.List;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/8/28 13:09<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
public interface MyBatchUpdateMapper<T> {
    @UpdateProvider(type = MyBatchUpdateProvider.class , method = "dynamicSQL")
    void batchUpdate(List<T> list);
}
