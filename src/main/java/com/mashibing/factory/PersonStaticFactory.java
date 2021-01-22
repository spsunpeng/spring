package com.mashibing.factory;

import com.mashibing.bean.Person;

/**
 * @author sunpeng
 * @Date 2021-01-21 10:04
 */
public class PersonStaticFactory {

    public static Person getInstance(){
        System.out.println("静态工厂");
        Person person = new Person();
        person.setId(1);
        person.setName("jia");
        person.setAge(20L);
        return person;
    }
}
