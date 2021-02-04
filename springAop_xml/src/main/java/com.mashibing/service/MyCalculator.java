package com.mashibing.service;

import org.springframework.stereotype.Service;

/**
 * @author sunpeng
 * @Date 2021-02-03 16:19
 */

public class MyCalculator{

    public int add(Integer i, Integer j) {
//        Method method = Calculator.class.getMethod("add", Integer.class, Integer.class);
//        LogUtil.start(method, i, j);
        int result = i + j;
        //LogUtil.stop(method, result);
        return result;
    }

    public int sub(Integer i, Integer j) {
        int result = i - j;
        return result;
    }

    public int mult(Integer i, Integer j) {
        int result = i * j;
        return result;
    }

    public int div(Integer i, Integer j) {
        int result = i / j;
        return result;
    }

}
