package com.mashibing.util;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author sunpeng
 * @Date 2021-01-29 13:22
 */
@Aspect
@Component
public class LogUtilAnnotation {

    @Before("execution( public int com.mashibing.service.MyCalculatorImpl.*(Integer,Integer) )")
    public static void start(){
        System.out.println("方法开始：");
    }

    @AfterReturning("execution( public int com.mashibing.service.MyCalculatorImpl.*(Integer,Integer) )")
    public static void stop(){
        System.out.println("方法stop：");
    }

    @AfterThrowing("execution( public int com.mashibing.service.MyCalculatorImpl.*(Integer,Integer) )")
    public static void exception(){
        System.out.println("方法异常：");
    }

    @After("execution( public int com.mashibing.service.MyCalculatorImpl.*(Integer,Integer) )")
    public static void end(){
        System.out.println("方法end...");
    }

}
