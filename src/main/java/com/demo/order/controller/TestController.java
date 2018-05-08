package com.demo.order.controller;

import com.demo.order.service.TestService;
import com.demo.order.vo.TestDemoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/demo/test")
public class TestController {

    @Autowired
    private TestService service;

    @RequestMapping(value = "", consumes = { MediaType.APPLICATION_JSON_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE } )
    public void test(@RequestBody TestDemoVo demo){
        System.out.printf(demo.getName());
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public void get(){
        service.testService();
    }
}
