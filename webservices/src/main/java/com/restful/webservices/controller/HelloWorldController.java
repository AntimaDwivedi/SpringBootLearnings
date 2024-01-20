package com.restful.webservices.controller;


import com.restful.webservices.bean.HelloWorldBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping(method = RequestMethod.GET , path = "/hello-world")
    public String helloworld() {
        return "Hello-World !!";
    }

    @GetMapping(path = "/hello-world-bean")
        public HelloWorldBean helloworldbean() {
            return new HelloWorldBean("It's a Hello world bean");
        }
}
