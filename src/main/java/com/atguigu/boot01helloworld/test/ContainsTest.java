package com.atguigu.boot01helloworld.test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenlong
 * @since 2022/4/27 11:35
 */
public class ContainsTest {

    @Test
    public void testStringContains() {
        String s = "期刊";
        String d = "英文期刊";

        System.out.println(s.contains("期刊"));
        System.out.println(d.contains("期刊"));
    }

    @Test
    public void testListContains(){
        List<String> stringList = new ArrayList<>();
        String s = "中文图书";
        String d = "英文期刊";
        stringList.add(s);
        stringList.add(d);
        System.out.println(stringList);



        System.out.println(stringList.contains("期刊"));
    }

}
