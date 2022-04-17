package com.atguigu.boot01helloworld.controller;

import com.atguigu.boot01helloworld.service.TestRestfulService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author chenlong
 * @since 2022/4/17 15:32
 */
@RestController
@RequestMapping("/rest")
public class TestRestfulController {

    @Autowired
    private TestRestfulService testRestfulService;

    @GetMapping("/car/{id}/owner/{username}")
    public Map<String, Object> getResult(@PathVariable Map<String, String> kv,
                                         @RequestHeader Map<String, String> request) {

        Map<String, Object> map = new HashMap<>();
        map.put("id", kv.get("id"));
        map.put("username", kv.get("username"));

        System.out.println(request.get("hh"));

        return map;
    }
}
