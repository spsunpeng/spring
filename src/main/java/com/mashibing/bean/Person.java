package com.mashibing.bean;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author sunpeng
 * @Date 2021-01-19 17:30
 */
public class Person {
    private int id;
    private String name;
    private Long age;
    private String sex;

    private String[] like;
    private List<String> list;
    private Address address;
    private Set<Address> addresses;
    private Map<String, Object> map;



    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", like=" + Arrays.toString(like) +
                ", list=" + list +
                ", address=" + address +
                ", addresses=" + addresses +
                ", map=" + map +
                '}';
    }

    public String[] getLike() {
        return like;
    }

    public void setLike(String[] like) {
        this.like = like;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Set<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<Address> addresses) {
        this.addresses = addresses;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public Person() {
        System.out.println("Person constructor");
    }

    public Person(int id, String name, Long age, String sex) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
