package com.test;

import com.learn.pojo.Customer;
import com.learn.service.CustomerService;
import com.learn.service.EmployeeService;
import org.junit.Test;
import org.springframework.context.annotation.Primary;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/8/28 12:41<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
public class MyMapperTest {
    private ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
    private CustomerService customerService = context.getBean(CustomerService.class);
    @Test
    public void testGetAll(){
        List<Customer> customerList = customerService.getAll();
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
        customerList = customerService.getAll();
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }

    @Test
    public void testBatchUpdate(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        CustomerService customerService = context.getBean(CustomerService.class);
        ArrayList<Customer> customers = new ArrayList<Customer>();
        customers.add(new Customer(1,"LJL",1000.00000,19));
        customers.add(new Customer(2,"LJLL",2000.00000,21));
        customers.add(new Customer(3,"LJLLL",3000.00000,22));
        customerService.batchUpdateEmp(customers);
    }

}
