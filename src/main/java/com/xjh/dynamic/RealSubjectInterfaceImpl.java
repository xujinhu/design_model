package com.xjh.dynamic;

/**
 * 被代理的类（委托类、真实类）RealSubject
 */
public class RealSubjectInterfaceImpl implements IRealSubjectInterface {

    @Override
    public String sayHello(String text) {

        System.out.println("真实类执行....");
        return text + "say hello";
    }

    @Override
    public String sayGoodBye() {
        return "say goodbye";
    }
}
