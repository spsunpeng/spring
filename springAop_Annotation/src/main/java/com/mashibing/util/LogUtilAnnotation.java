package com.mashibing.util;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author sunpeng
 * @Date 2021-01-29 13:22
 */

/**
 * "execution( public int com.mashibing.service.*.*(Integer,Integer) )")
 * execution( public * com.mashibing.service.*.*(..) )")
 * "execution( * *(..) )")
 */
@Aspect
@Component
//@Order(2) 多切面时的执行顺序
public class LogUtilAnnotation {

    @Pointcut("execution( public * com.mashibing.service.*.*(..) )")
    public void myPointcut(){}

    @Before("myPointcut(){}")
    public void start(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println(name+"方法开始："+Arrays.asList(args));
    }

    @AfterReturning(value = "myPointcut(){}", returning = "result") //try里
    public void stop(JoinPoint joinPoint, Integer result){
        String name = joinPoint.getSignature().getName();
        System.out.println(name+"方法AfterReturning："+result);
    }


    @AfterThrowing(value = "myPointcut(){}", throwing = "e")
    public void exception(JoinPoint joinPoint, Exception e){
        String name = joinPoint.getSignature().getName();
        System.out.println(name+"方法异常："+"e");
    }

    @After(value = "myPointcut(){}") //try外,没有参数returning
    private int end(JoinPoint joinPoint){         //private int stop不影响，没用
        String name = joinPoint.getSignature().getName();
        System.out.println(name+"方法After...");
        return 1;
    }

    @Around(value = "myPointcut(){}")
    public Object around(ProceedingJoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        Object result = "";
        try {
            System.out.println(name+"(around)方法开始："+Arrays.asList(joinPoint.getArgs()));
            result = joinPoint.proceed();
            System.out.println(name+"(around)方法AfterReturning："+result);
        } catch (Throwable throwable) {
            System.out.println(name+"(around)方法异常："+"e");
            throwable.printStackTrace();
        }
        System.out.println(name+"(around)方法After...");
        return result;
    }

}
