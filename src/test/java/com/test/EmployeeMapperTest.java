package com.test;

import com.learn.pojo.Employee;
import com.learn.service.EmployeeService;
import org.apache.ibatis.session.RowBounds;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

import static org.junit.Assert.*;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/8/16 12:49<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
public class EmployeeMapperTest {
    private ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
    private EmployeeService employeeService = context.getBean(EmployeeService.class);

    @Test
    public void deleteByPrimaryKey() {
        Integer empId = 10;
        employeeService.removeEmpById(empId);
    }

    @Test
    public void delete() {
    }

    @Test
    public void insert() {
        Employee employee = new Employee(null, "emp01", 1000.00, 20);
        employeeService.saveEmp(employee);
        Integer empId = employee.getEmpId();
        System.out.println(empId);
    }

    /**
     * 如果插入的某些字段为null, 则sql语句中没有该字段信息
     */
    @Test
    public void insertSelective() {
        Employee employee = new Employee(null, "emp02", null, 21);
        employeeService.saveEmpSelective(employee);
    }

    @Test
    public void existsWithPrimaryKey() {
        Integer empId = 33;
        boolean exists = employeeService.isExists(empId);
        System.out.println(exists);
    }

    @Test
    public void selectAll() {
        List<Employee> employeeList = employeeService.getAll();
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    @Test
    public void selectByPrimaryKey() {
        Integer empId = 4;
        Employee employee = employeeService.getEmpById(empId);
        System.out.println(employee);
    }

    @Test
    public void selectCount() {
    }

    @Test
    public void select() {
        Employee employeeConditon = new Employee(null, "tom", null, null);
        Employee employeeResult = employeeService.getone(employeeConditon);
        System.out.println(employeeResult);
    }

    @Test
    public void selectOne() {
    }

    @Test
    public void updateByPrimaryKey() {
    }

    @Test
    public void updateByPrimaryKeySelective() {
        Employee employee = new Employee(7, "empNewName", null, null);
        employeeService.updateEmpSelective(employee);
    }

    @Test
    public void deleteByExample() {
    }

    @Test
    public void selectByExample() {
        Example example = new Example(Employee.class);
        example.orderBy("EmpSalary").asc().orderBy("EmpAge").desc();
        example.setDistinct(true);
        Example.Criteria criteria = example.createCriteria();
        Example.Criteria criteria1 = example.createCriteria();
        criteria.andGreaterThan("EmpSalary",1000).andLessThan("EmpAge",30);
        criteria1.andLessThan("EmpSalary",5000).andGreaterThan("EmpAge",20);
        example.and(criteria1);
        List<Employee> employeeList = employeeService.getEmpByExample(example);
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    @Test
    public void selectCountByExample() {
    }

    @Test
    public void selectOneByExample() {
    }

    @Test
    public void updateByExample() {
    }

    @Test
    public void updateByExampleSelective() {
    }

    @Test
    public void selectByExampleAndRowBounds() {
    }

    @Test
    public void selectByRowBounds() {
        int pageNo = 3;
        int pageSize = 5;
        int index = (pageNo - 1)*pageSize;
        RowBounds rowBounds = new RowBounds(index,pageSize);
        List<Employee> list = employeeService.getEmpListByRowBounds(rowBounds);
        for (Employee employee : list) {
            System.out.println(employee);
        }

    }
}