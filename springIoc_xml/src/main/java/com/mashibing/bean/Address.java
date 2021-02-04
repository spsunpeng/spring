package com.mashibing.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sunpeng
 * @Date 2021-01-20 15:30
 */
public class Address {
    private String province;
    private String city;

    private static List<String> fun(){
        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        return list;
    }

    @Override
    public String toString() {
        return "Address{" +
                "province='" + province + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public Address() {
        System.out.println("Address constructor");
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
