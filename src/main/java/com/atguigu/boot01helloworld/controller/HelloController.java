package com.atguigu.boot01helloworld.controller;

import com.atguigu.boot01helloworld.bean.Car;
import com.atguigu.boot01helloworld.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author chenlong
 * @since 2022/3/27 12:10
 */
@RestController
public class HelloController {

    @Autowired
    private Car car;

    @Autowired
    private Person person;

    @RequestMapping("/car")
    public Car getCar() {
        return car;
    }

    @RequestMapping("/hello2")
    public String handle01() {
        return "Hello SpringBoot" + "你好";
    }

    @RequestMapping("/person")
    public Person person() {
        return person;
    }

    @GetMapping("/user")
    public String getUser() {
        return "GET-张三";
    }

    @PostMapping("/user")
    public String savaUser() {
        return "POST-张三";
    }

    @PutMapping("/user")
    public String putUser() {
        return "PUT-张三";
    }

    @DeleteMapping("/user")
    public String deleteUser() {
        return "DELETE-张三";
    }
}
