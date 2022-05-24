package com.atguigu.boot01helloworld.test.autorun;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author chenlong
 * @since 2022/5/22 22:18
 */
@Component
@Order(1)
public class TestApplicationRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("order1:TestApplicationRunner");
    }
}
