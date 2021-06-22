package com.learn.pojo;

import javax.persistence.*;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/8/16 12:15<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
@Table(name = "tabple_emp")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private Integer EmpId;
    @Column(name = "emp_name")
    private String EmpName;
    @Column(name = "emp_salary")
    private Double EmpSalary;
    @Column(name = "emp_age")
    private Integer EmpAge;
    //非数据库表字段,使用@transient注解
    @Transient
    private String LJL;

    public Employee() {
    }

    public Employee(Integer empId, String empName, Double empSalary, Integer empAge) {
        EmpId = empId;
        EmpName = empName;
        EmpSalary = empSalary;
        EmpAge = empAge;
    }

    public Integer getEmpId() {
        return EmpId;
    }

    public void setEmpId(Integer empId) {
        EmpId = empId;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

    public Double getEmpSalary() {
        return EmpSalary;
    }

    public void setEmpSalary(Double empSalary) {
        EmpSalary = empSalary;
    }

    public Integer getEmpAge() {
        return EmpAge;
    }

    public void setEmpAge(Integer empAge) {
        EmpAge = empAge;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "EmpId=" + EmpId +
                ", EmpName='" + EmpName + '\'' +
                ", EmpSalary=" + EmpSalary +
                ", EmpAge=" + EmpAge +
                '}';
    }
}

