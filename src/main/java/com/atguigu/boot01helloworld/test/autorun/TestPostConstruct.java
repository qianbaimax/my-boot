package com.atguigu.boot01helloworld.test.autorun;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author chenlong
 * @since 2022/5/22 22:17
 */
@Component
public class TestPostConstruct {
    static {
        System.out.println("static");
    }

    public TestPostConstruct() {
        System.out.println("constructer");
    }

    @PostConstruct
    public void init() {
        System.out.println("PostConstruct");
    }
}
