package com.test;

import com.learn.pojo.Address;
import com.learn.pojo.SeasonEnum;
import com.learn.pojo.User;
import com.learn.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class TypeHandlerTest {

    private UserService userService;

    {
        userService = new ClassPathXmlApplicationContext("spring-context.xml").getBean(UserService.class);
    }

    @Test
    public void testQueryUser() {

        Integer userId = 4;

        User user = userService.getUserById(userId);

        System.out.println(user);
    }

    @Test
    public void testSaveUser() {

        User user = new User(null, "tom10", new Address("AaA", "BbB", "CcC"), SeasonEnum.WINTER);

        userService.saveUser(user);

    }

}
