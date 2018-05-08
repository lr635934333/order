package com.demo.order.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

//@Configuration
//@EnableWebMvc
//@ComponentScan(basePackages = { "com.demo.order.config"})
public class MySqlConfig {
    @Bean
    public DataSource dataSource() {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        try {
            dataSource.setDriverClass("com.mysql.jdbc.Driver.class");
        } catch (PropertyVetoException e) {
            e.printStackTrace();
        }
        dataSource.setUser("root");
        dataSource.setJdbcUrl("jdbc:mysql://192.168.249.136e:3306/test?useUnicode=true&amp;characterEncoding=UTF-8");
        dataSource.setPassword("liuran");
        return dataSource;
    }
}
