package com.xjh.factorymethod;
/**
 * <p>Description: </p>
 * @Date 2020-12-01
 * @author xujinhu
 * 意图:
 *  定义了一个创建对象的接口，但由子类决定要实例化哪个类。工厂方法把实例化推迟到子类。
 */
public abstract class PublicCarFatory {

    public abstract IPublicCar createCar();

    public void doSomeThing(){
        System.out.println("do someThing");
    }


}
