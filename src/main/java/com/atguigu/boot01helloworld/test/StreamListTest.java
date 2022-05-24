package com.atguigu.boot01helloworld.test;

import com.atguigu.boot01helloworld.bean.BaseDictResponse;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author chenlong
 * @since 2022/4/27 12:48
 */
public class StreamListTest {

    @Test
    public void test() {
        // 构造集合1
        List<BaseDictResponse> marcTypes = buildBaseDictResponseList();

        // 构造集合2
        List<String> marcTypeTemplateIdList = new ArrayList<>();
        marcTypeTemplateIdList.add("87148611-e4c5-4cb0-8fb4-a57c44e5528c");
        marcTypeTemplateIdList.add("c25b2100-2d86-42bb-88b0-9fd16b5a6854");

        // 处理集合间包含关系
        List<String> marcNameList = marcTypes.stream().filter(baseDictResponse -> marcTypeTemplateIdList.contains(baseDictResponse.getId()))
                .map(BaseDictResponse::getName)
                .collect(Collectors.toList());

        System.out.println(marcNameList);

    }

    private List<BaseDictResponse> buildBaseDictResponseList() {
        BaseDictResponse baseDictResponse1 = new BaseDictResponse();
        baseDictResponse1.setId("e9427355-5af7-4ab1-add2-4ddf224c4cb5");
        baseDictResponse1.setName("张三");

        BaseDictResponse baseDictResponse2 = new BaseDictResponse();
        baseDictResponse2.setId("87148611-e4c5-4cb0-8fb4-a57c44e5528c");
        baseDictResponse2.setName("李四");

        BaseDictResponse baseDictResponse3 = new BaseDictResponse();
        baseDictResponse3.setId("c25b2100-2d86-42bb-88b0-9fd16b5a6854");
        baseDictResponse3.setName("王五");

        List<BaseDictResponse> baseDictResponseList = new ArrayList<>();
        baseDictResponseList.add(baseDictResponse1);
        baseDictResponseList.add(baseDictResponse2);
        baseDictResponseList.add(baseDictResponse3);
        return baseDictResponseList;
    }

}
