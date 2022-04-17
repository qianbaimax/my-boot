package com.atguigu.boot01helloworld.controller;

import com.atguigu.boot01helloworld.service.TestRetry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenlong
 * @since 2022/4/17 9:21
 */
@RestController
public class TestRetryController {

    @Autowired
    private TestRetry testRetry;

    @GetMapping("/testRetry")
    public String test() throws Exception {
        return testRetry.getTestRetryResult();
    }
}
