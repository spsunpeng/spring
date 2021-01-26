package com.mashibing.service;

import com.mashibing.dao.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author sunpeng
 * @Date 2021-01-26 16:05
 */
@Service
public class PersonService {

    @Autowired
    private PersonDao personDao;

    public void save(){
        personDao.save();
    }
}
