package com.blue.example.echo;

import org.msgpack.annotation.Message;

import java.io.Serializable;

/**
 * @Author: Jason
 * @E-mail: 1075850619@qq.com
 * @Date: create in 2019/3/26 16:08
 * @Modified by:
 * @Project: learning-netty
 * @Package: com.blue.example.echo
 * @Description:
 */
@Message
public class UserInfo implements Serializable {
    private static final long serialVersionUID = 1;

    private String name;
    private Integer age;

    public UserInfo() {
    }

    public UserInfo buildName(String name) {
        this.name = name;
        return this;
    }

    public UserInfo buildAge(int age) {
        this.age = age;
        return this;
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

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}
