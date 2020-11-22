package com.xjh.dynamic;

import java.lang.reflect.Proxy;

public class Test {

    public static void main(String[] args) {

        //真实的实现
        IRealSubjectInterface realSubject = new RealSubjectInterfaceImpl();


        ClassLoader classLoader = realSubject.getClass().getClassLoader();
        Class<?>[] interfaces = realSubject.getClass().getInterfaces();
        InvocationHandleImpl invocationHandle = new InvocationHandleImpl(realSubject);

        IRealSubjectInterface proxyInstance = (IRealSubjectInterface)Proxy.newProxyInstance(classLoader, interfaces, invocationHandle);

        System.out.println(proxyInstance.sayHello("小明"));

    }
}
