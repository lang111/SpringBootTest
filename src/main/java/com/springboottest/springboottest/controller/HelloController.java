package com.springboottest.springboottest.controller;
import cn.clboy.spring.boot.Service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;



    @GetMapping(value = "/hello")
    public String hello(@RequestParam(value = "param") String param) {
        return param;
    }

    @GetMapping("/sayHello")
    public String say(@RequestParam(value="name") String name){
        String hello = helloService.sayHello(name);
        return hello;
    }




}
