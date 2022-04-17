package com.atguigu.boot01helloworld.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author chenlong
 * @since 2022/4/4 17:49
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String name;
    private Integer age;


}
