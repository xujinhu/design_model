package com.xjh.dynamic;

/**
 * 真实对象的实现接口:需要动态代理的接口
 */
public interface IRealSubjectInterface {

    public String sayHello(String text);

    public String sayGoodBye();
}
