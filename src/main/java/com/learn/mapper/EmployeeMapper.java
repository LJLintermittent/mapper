package com.learn.mapper;

import com.learn.pojo.Employee;
import org.apache.ibatis.session.RowBounds;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/8/16 12:39<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
public interface EmployeeMapper extends Mapper<Employee> {

}
