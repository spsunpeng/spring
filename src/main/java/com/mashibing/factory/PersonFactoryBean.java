package com.mashibing.factory;

import com.mashibing.bean.Person;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.cglib.proxy.Factory;

/**
 * @author sunpeng
 * @Date 2021-01-21 10:58
 */
/*
* 此方式是创建bean对象的一种补充，
* （1）用户可以按照自己的需求创建对象（person），创建的对象由ioc容器管理(person)，但是（PersonFactoryBean）这个类本身还是需要配置
* （2）是单例模式，但只会在使用时创建
* */
public class PersonFactoryBean implements FactoryBean<Person> {

    @Override
    public Class<?> getObjectType() {
        return Person.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    @Override
    public Person getObject() throws Exception {
        System.out.println("FactoryBean");
        Person person = new Person();
        person.setId(10);
        person.setName("zhangsan");
        return person;
    }
}
