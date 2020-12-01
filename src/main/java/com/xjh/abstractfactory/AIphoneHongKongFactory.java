package com.xjh.abstractfactory;

public class AIphoneHongKongFactory extends AbstractFactory {
    @Override
    public Iphone4Parent createIphone4() {
        return new Iphone4HongKong();
    }

    @Override
    public Iphone6Parent createIphone6() {
        return new Iphone6HongKong();
    }
}
