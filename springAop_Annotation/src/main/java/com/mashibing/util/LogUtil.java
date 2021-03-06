package com.mashibing.util;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author sunpeng
 * @Date 2021-01-27 15:47
 */
public class LogUtil {

    public static void start(Method method, Object ... objects){
        System.out.println(method.getName()+"方法开始："+ Arrays.asList(objects));
    }

    public static void AfterReturning(Method method ,Object ... objects){
        System.out.println(method.getName()+"方法AfterReturning："+ Arrays.asList(objects));
    }

    public static void exception(Method method ,Exception e){
        System.out.println(method.getName()+"方法异常："+ e.getMessage());
    }

    public static void After(Method method){
        System.out.println(method.getName()+"方法After...");
    }

}
