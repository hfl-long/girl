package com.hfl.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;

/**
 * @Author:黄飞龙
 * @Date: Created in 21:32 2017/5/15
 */

@Entity//表示这个类对应数据库中的一个表
public class Girl {
    @Id
    @GeneratedValue//表示id为自增
    private Integer id;
    private String cupSize;
    @Min(value = 18,message = "未成年少女禁止入门")
    private Integer age;

    public Girl() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
