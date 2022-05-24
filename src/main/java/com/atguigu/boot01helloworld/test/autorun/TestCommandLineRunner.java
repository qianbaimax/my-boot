package com.atguigu.boot01helloworld.test.autorun;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author chenlong
 * @since 2022/5/22 22:19
 */
@Component
@Order(2)
public class TestCommandLineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("order2:TestCommandLineRunner");
    }
}
