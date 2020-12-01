package com.xjh.abstractfactory;
/**
 * <p>Description: </p>
 * @Date 2020-12-01
 * @author xujinhu
 */
public class AIphoneAmerFactory extends AbstractFactory {
    @Override
    public Iphone4Parent createIphone4() {
        return new Iphone4Amer();
    }

    @Override
    public Iphone6Parent createIphone6() {
        return new IPhone6Amer();
    }
}
