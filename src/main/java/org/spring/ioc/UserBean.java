package org.spring.ioc;

public class UserBean {
/*
    Bean의 특징
    1. 기본 생성자를 가지고 있다.
    2. 필드가 private으로 선언된다.
    3. getter, setter 메소드를 가지고 있다.
 */
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
