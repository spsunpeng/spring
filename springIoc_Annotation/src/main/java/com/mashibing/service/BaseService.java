package com.mashibing.service;

import com.mashibing.dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author sunpeng
 * @Date 2021-01-27 11:27
 */

public class BaseService<T> {
    @Autowired
    BaseDao<T> baseDao;

    public void save(){
        System.out.println("自动注入的对象："+baseDao);
        baseDao.save();
    }
}
