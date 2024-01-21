package com.restful.webservices.controller;


import com.restful.webservices.bean.HelloWorldBean;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @RequestMapping(method = RequestMethod.GET, path = "/hello-world")
    public String helloworld() {
        return "Hello-World !!";
    }

    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloworldbean() {
        return new HelloWorldBean("It's a Hello world bean");
    }

    //Path-parameters
    //hello-world/path-variable/{name}
    //hello-world/path-variable/Ravi
    @GetMapping(path = "/hello-world-path-variable/{name}")
    public HelloWorldBean helloworldPathVariable(@PathVariable String name) {
        return new HelloWorldBean(String.format("Hello User ,%s" ,name));
    }
}


