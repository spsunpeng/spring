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

    public static void stop(Method method ,Object ... objects){
        System.out.println(method.getName()+"方法结束："+ Arrays.asList(objects));
    }
}
