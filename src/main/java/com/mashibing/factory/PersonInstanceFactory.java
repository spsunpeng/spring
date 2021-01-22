package com.mashibing.factory;

import com.mashibing.bean.Person;

/**
 * @author sunpeng
 * @Date 2021-01-21 10:06
 */
public class PersonInstanceFactory {

    public Person getInstance(){
        System.out.println("工厂方法");
        Person person = new Person();
        person.setId(2);
        person.setName("yi");
        person.setAge(21L);
        return person;
    }

}
