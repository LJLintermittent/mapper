package com.learn.service;

import com.learn.mapper.CustomerMapper;
import com.learn.mapper.EmployeeMapper;
import com.learn.pojo.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/8/28 12:42<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
@Service
public class CustomerService {
    @Autowired
    private CustomerMapper customerMapper;

    public List<Customer> getAll() {
        return customerMapper.selectAll();
    }

    public void batchUpdateEmp(ArrayList<Customer> customers) {
        customerMapper.batchUpdate(customers);
    }
}
