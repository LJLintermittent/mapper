package com.learn.service;

import com.learn.mapper.EmployeeMapper;
import com.learn.pojo.Employee;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/8/16 12:40<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
@Service
public class EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;

    public Employee getone(Employee employeeConditon) {
        return employeeMapper.selectOne(employeeConditon);
    }

    public List<Employee> getAll() {
        return employeeMapper.selectAll();
    }

    public Employee getEmpById(Integer empId) {
        return employeeMapper.selectByPrimaryKey(empId);
    }

    public boolean isExists(Integer empId) {
        return employeeMapper.existsWithPrimaryKey(empId);
    }

    public void saveEmp(Employee employee) {
        employeeMapper.insert(employee);
    }

    public void saveEmpSelective(Employee employee) {
        employeeMapper.insertSelective(employee);
    }

    public void updateEmpSelective(Employee employee) {
        employeeMapper.updateByPrimaryKeySelective(employee);
    }

    public void removeEmpById(Integer empId) {
        employeeMapper.deleteByPrimaryKey(empId);
    }

    public List<Employee> getEmpByExample(Example example) {
        return employeeMapper.selectByExample(example);
    }

    public List<Employee> getEmpListByRowBounds(RowBounds rowBounds) {
        return employeeMapper.selectByRowBounds(null,rowBounds);
    }
}
