package com.demo.order.config;

import org.springframework.context.annotation.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
//@Import({MySqlConfig.class})
@ComponentScan(basePackages = {"com.demo.order"})
public class AppConfiguration extends WebMvcConfigurerAdapter{

}
