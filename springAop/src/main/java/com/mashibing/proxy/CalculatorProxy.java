package com.mashibing.proxy;

import com.mashibing.service.Calculator;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author sunpeng
 * @Date 2021-01-27 17:28
 */
public class CalculatorProxy {

    public static Calculator getCalculator(final Calculator calculator){

        ClassLoader loader = calculator.getClass().getClassLoader();
        Class<?>[] interfaces = calculator.getClass().getInterfaces();

        InvocationHandler invocationHandler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("start");
                Object invoke = method.invoke(calculator, args);
                return invoke;
            }
        };

        Object o = Proxy.newProxyInstance(loader, interfaces, invocationHandler);
        return (Calculator) o;
    }
}
