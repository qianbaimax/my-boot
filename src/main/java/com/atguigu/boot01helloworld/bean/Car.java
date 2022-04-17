package com.atguigu.boot01helloworld.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 只有在容器中的组件，才会拥有SpringBoot提供的强大功能
 *
 * @author chenlong
 * @since 2022/4/6 21:31
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
//@Component
@ConfigurationProperties(prefix = "mycar")
public class Car {
    private String brand;
    private Integer price;
}
