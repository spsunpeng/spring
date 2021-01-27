package com.mashibing.dao;

import com.mashibing.bean.Student;
import org.springframework.stereotype.Repository;

/**
 * @author sunpeng
 * @Date 2021-01-27 10:26
 */
@Repository
public class StudentDao<T> extends BaseDao<Student> {
    public void save(){
        System.out.println("StudentDao save success");
    }
}
