package com.atguigu.boot01helloworld.test;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.atguigu.boot01helloworld.bean.Car;
import org.junit.Test;

/**
 * @author chenlong
 * @since 2022/4/23 9:46
 */
public class FastJson2Test {
    @Test
    public void test() {
//        String s = "{\"fields\":[{\"001\":\"112001001578\"},{\"005\":\"20150310102146.8\"},{\"011\":{\"ind1\":\" \",\"ind2\":\" \",\"subfields\":[{\"a\":\"978-7-115-33066-6\"},{\"d\":\"CNY\"}]}},{\"100\":{\"ind1\":\" \",\"ind2\":\" \",\"subfields\":[{\"a\":\"yyyymmddd2003    km y0chiy0120    ea\"}]}},{\"101\":{\"ind1\":\"0\",\"ind2\":\" \",\"subfields\":[{\"a\":\"chi\"}]}},{\"102\":{\"ind1\":\" \",\"ind2\":\" \",\"subfields\":[{\"a\":\"CN\"},{\"b\":\"110000\"}]}},{\"105\":{\"ind1\":\" \",\"ind2\":\" \",\"subfields\":[{\"a\":\"y   z   000yy\"}]}},{\"106\":{\"ind1\":\" \",\"ind2\":\" \",\"subfields\":[{\"a\":\"r\"}]}},{\"200\":{\"ind1\":\"1\",\"ind2\":\" \",\"subfields\":[{\"a\":\"爸爸给我讲故事\"},{\"9\":\"ba ba gei wo jiang gu shi\"}]}},{\"210\":{\"ind1\":\" \",\"ind2\":\" \",\"subfields\":[{\"a\":\"北京\"}]}},{\"215\":{\"ind1\":\" \",\"ind2\":\" \",\"subfields\":[{\"a\":\"214页\"},{\"d\":\"26CM\"}]}},{\"690\":{\"ind1\":\" \",\"ind2\":\" \",\"subfields\":[{\"a\":\"I\"}]}},{\"711\":{\"ind1\":\"0\",\"ind2\":\"1\",\"subfields\":[{\"a\":\"本刊编辑部\"},{\"4\":\"编\"},{\"9\":\"ben kan bian ji bu\"}]}},{\"801\":{\"ind1\":\" \",\"ind2\":\"0\",\"subfields\":[{\"a\":\"CN\"},{\"b\":\"ST\"},{\"c\":\"20150310\"}]}},{\"905\":{\"ind1\":\" \",\"ind2\":\" \",\"subfields\":[{\"a\":\"ST\"},{\"f\":\"I/469\"}]}}],\"leader\":\"00518nam0 2200205   45  \"}";
        Car car = new Car();
        car.setBrand("wbs");
        car.setPrice(101);
        String s = JSON.toJSONString(car);
        System.out.println(s);
        JSONObject jsonObject = JSON.parseObject(s);
        System.out.println(jsonObject);
        String brand = jsonObject.getString("brand");
        System.out.println(brand);

        Car car1 = JSON.parseObject(s, Car.class);
        System.out.println(car1);
    }
}
