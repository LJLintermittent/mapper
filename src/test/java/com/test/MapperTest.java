package com.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/8/16 12:14<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
public class MapperTest {
    private ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
    @Test
    public void testConnection() throws SQLException {
        DataSource bean = context.getBean(DataSource.class);
        Connection connection = bean.getConnection();
        System.out.println(connection);
    }
}
