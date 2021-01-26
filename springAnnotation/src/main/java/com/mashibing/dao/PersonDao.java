package com.mashibing.dao;

import org.springframework.stereotype.Repository;

/**
 * @author sunpeng
 * @Date 2021-01-26 16:06
 */
@Repository
public class PersonDao {
    public void save(){
        System.out.println("save success");
    }
}
