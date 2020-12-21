package com.tyjw.inspectline.pdf.demo.bean;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther:
 * @Date: 2019/12/09/11:16
 * @Description:
 */
public class Person {

    private String name;
    private Integer age;
    private String sex;

    public Person() {
    }

    public Person(String name, Integer age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}