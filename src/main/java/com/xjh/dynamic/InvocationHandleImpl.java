package com.xjh.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 *调用处理器实现类（有木有感觉这里就是传说中的AOP啊）
 * 每次生成动态代理类对象的时候都需要指定一个实现了该接口的调用处理器类
 *  */
public class InvocationHandleImpl implements InvocationHandler {

    /**
     * 我们要代理的真实对象
     * //为了new InvocationHandlerImpl(realSubject);传参名一致
     */
    private IRealSubjectInterface realSubjectInterface;

    public InvocationHandleImpl(IRealSubjectInterface realSubjectInterface) {
        this.realSubjectInterface = realSubjectInterface;
    }

    /**
     * invoke方法负责处理动态代理类中所有方法调用
     * 调用处理器根据这三个参数进行预处理或分派到委托类实例上反射执行
     * @param proxy  生成的代理对象   //com.xjh.dynamic.RealSubjectInterfaceImpl@546a03af
     * @param method 代理对象要执行的方法  //public abstract java.lang.String com.xjh.dynamic.IRealSubjectInterface.sayHello(java.lang.String)
     * @param args    //参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("在用代理对象调用真实对象的方法之前，类似AOP的Before()，自己的操作");

        Object returnObj = method.invoke(realSubjectInterface, args);

        System.out.println("在用代理对象调用真实对象的方法之后，但是返回值returnValue之前，自己的操作?");
        return returnObj;
    }
}
