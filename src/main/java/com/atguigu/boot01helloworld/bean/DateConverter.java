package com.atguigu.boot01helloworld.bean;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.NumberUtil;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author chenlong
 * @since 2022/4/18 0:23
 */
@Component
public class DateConverter implements Converter<String, Date> {

    @Override
    public Date convert(String source) {

        return DateUtil.parse(source.trim());
    }

    public static void main(String[] args) {
        if (NumberUtil.isInteger("305l")) {
            System.out.println("是int型");
        }else {
            System.out.println("俺不知道");
        }
    }
}
