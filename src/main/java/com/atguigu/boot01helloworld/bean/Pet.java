package com.atguigu.boot01helloworld.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author chenlong
 * @since 2022/4/4 17:50
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Pet {
    private String name;
    private Double weight;
}
