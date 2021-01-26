package com.mashibing.controller;

import com.mashibing.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.sql.Savepoint;

/**
 * @author sunpeng
 * @Date 2021-01-26 16:06
 */
@Controller
public class PersonController {

    @Autowired
    private PersonService personService;
    //按照类型注入，如果此类型有继承【PersonService】、或者多个实习，则按照id继承【personService】

    public void save(){
        System.out.println(personService);
        personService.save();
    }
}
