package com.learn.pojo;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "tabple_cust")
public class Customer implements Serializable {
    @Id
    @Column(name = "cust_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer custId;

    @Column(name = "cust_name")
    private String custName;

    @Column(name = "cust_salary")
    private Double custSalary;

    @Column(name = "cust_age")
    private Integer custAge;

    public Customer() {
    }

    public Customer(Integer custId, String custName, Double custSalary, Integer custAge) {
        this.custId = custId;
        this.custName = custName;
        this.custSalary = custSalary;
        this.custAge = custAge;
    }

    /**
     * @return cust_id
     */
    public Integer getCustId() {
        return custId;
    }

    /**
     * @param custId
     */
    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    /**
     * @return cust_name
     */
    public String getCustName() {
        return custName;
    }

    /**
     * @param custName
     */
    public void setCustName(String custName) {
        this.custName = custName;
    }

    /**
     * @return cust_salary
     */
    public Double getCustSalary() {
        return custSalary;
    }

    /**
     * @param custSalary
     */
    public void setCustSalary(Double custSalary) {
        this.custSalary = custSalary;
    }

    /**
     * @return cust_age
     */
    public Integer getCustAge() {
        return custAge;
    }

    /**
     * @param custAge
     */
    public void setCustAge(Integer custAge) {
        this.custAge = custAge;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custId=" + custId +
                ", custName='" + custName + '\'' +
                ", custSalary=" + custSalary +
                ", custAge=" + custAge +
                '}';
    }
}