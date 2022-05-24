package com.atguigu.boot01helloworld.bean;

import lombok.Data;

/**
 * title BaseDictResponse
 * Description 字典数据实体类
 * CreateDate 2021/11/18 15:01
 * author izhouy
 */
@Data
public class BaseDictResponse {

    /**
     * 字典id
     */
    private String id;

    /**
     * 字典name
     */
    private String name;

    /**
     * 字典code
     */
    private String code;

    /**
     * 状态
     */
    private Boolean status;

    /**
     * 折扣率
     */
    private String discountPercent;

    /**
     * 馆藏地对应的流通类型id
     */
    private String relationId;

}
