package com.mashibing.proxy;

import com.mashibing.service.Calculator;
import com.mashibing.service.MyCalculatorImpl;
import com.mashibing.util.LogUtil;
import sun.rmi.runtime.Log;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author sunpeng
 * @Date 2021-01-27 17:28
 */
public class CalculatorProxy {

    public static Calculator getCalculator(final Calculator calculator){
        Class cls = calculator.getClass();
        InvocationHandler invocationHandler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object result = null;
                try{
                    LogUtil.start(method, args);
                    result = method.invoke(calculator, args);
                    LogUtil.stop(method, result);
                }catch (Exception e){
                    LogUtil.exception(method, e);
                }finally {
                    LogUtil.end(method);
                }
                return result;
            }
        };
        Object o = Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), invocationHandler);
        return (Calculator) o;
    }
}
