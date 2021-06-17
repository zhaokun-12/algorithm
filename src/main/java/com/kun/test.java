package com.kun;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description
 * @Author zhaokun
 * @Date 2020/11/12
 * @Version 1.0
 **/
public class test {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName(null);
        Person p2 = new Person();
        p2.setName("");
        Person p3 = new Person();
        p3.setName("name");

        List<Person> peoples = new ArrayList<>();
        peoples.add(p1);
        peoples.add(p2);
        peoples.add(p3);
        List<String> collect = peoples.stream().map(Person::getName).collect(Collectors.toList());
        System.out.println(collect);
        System.out.println(collect.size());
    }

}
class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}