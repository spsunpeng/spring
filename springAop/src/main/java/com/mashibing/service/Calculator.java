package com.mashibing.service;

import com.mashibing.util.LogUtil;

import java.lang.reflect.Method;

/**
 * @author sunpeng
 * @Date 2021-01-27 15:47
 */
public class Calculator {

    public int add(Integer i, Integer j) throws NoSuchMethodException {
//        Method method = Calculator.class.getMethod("add", Integer.class, Integer.class);
//        LogUtil.start(method, i, j);
        int result = i + j;
        //LogUtil.stop(method, result);
        return result;
    }

    public int sub(int i, int j) {
        int result = i - j;
        return result;
    }
}
