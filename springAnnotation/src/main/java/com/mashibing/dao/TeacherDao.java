package com.mashibing.dao;

import com.mashibing.bean.Teacher;
import org.springframework.stereotype.Repository;

/**
 * @author sunpeng
 * @Date 2021-01-27 10:26
 */
@Repository
public class TeacherDao extends BaseDao<Teacher> {
    public void save(){
        System.out.println("TeacherDao save success");
    }
}
