package com.hong.domain;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * Created by hong on 2017/4/20.
 */
public class User {

    private Long id;
    private String name;
    private Integer age;

    /**
     *  使用自定义的第三方json 框架 fastjson 格式化日期
     */
    @JSONField(format ="yyyy-MM-dd HH:mm")
    private Date createTime;

    /**
     * 使用fastjson 指定字符不进行序列化
     */
    @JSONField(serialize = false)
    private String msg;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
