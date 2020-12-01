package com.xjh.abstractfactory;
/**
 * <p>Description: 抽象工厂</p>
 * @Date 2020-12-01
 * @author xujinhu
 * 提供一个接口，用于创建  相关的对象家族 。
 * 抽象工厂模式创建的是对象家族，也就是很多对象而不是一个对象，并且这些对象是相关的，
 * 也就是说必须一起创建出来。而工厂方法模式只是用于创建一个对象，这和抽象工厂模式有很大不同。
 */
public  abstract class AbstractFactory {

    public abstract Iphone4Parent createIphone4();

    public abstract Iphone6Parent createIphone6();
}
