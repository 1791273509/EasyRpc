package com.github.yeecode.easyrpc.client;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author didi
 * @Date 2021/2/23
 */
public class ProxyStudent implements InvocationHandler {
    Object target;

    public ProxyStudent(Object target) {
        this.target = target;
    }

    @Override public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理前");
        method.invoke(target);
        System.out.println("代理后");
        return null;
    }
    public  Object getProxy(){
        return Proxy.newProxyInstance(this.target.getClass().getClassLoader(),
                this.target.getClass().getInterfaces(), this);
    }
}
    