package com.mashibing.service;

import com.mashibing.util.LogUtil;
import org.springframework.stereotype.Service;

import java.lang.reflect.Method;

/**
 * @author sunpeng
 * @Date 2021-01-27 15:47
 */
@Service
public class MyCalculatorImpl implements Calculator{
    @Override
    public int add(Integer i, Integer j) {
//        Method method = Calculator.class.getMethod("add", Integer.class, Integer.class);
//        LogUtil.start(method, i, j);
        int result = i + j;
        //LogUtil.stop(method, result);
        return result;
    }

    @Override
    public int sub(Integer i, Integer j) {
        int result = i - j;
        return result;
    }

    @Override
    public int mult(Integer i, Integer j) {
        int result = i * j;
        return result;
    }

    @Override
    public int div(Integer i, Integer j) {
        int result = i / j;
        return result;
    }

}
