package com.xjh.factorymethod;
/**
 * <p>Description: 朗逸工厂类</p>
 * @Date 2020-12-01
 * @author xujinhu
 */
public class LavidaCarFactory extends PublicCarFatory {

    @Override
    public IPublicCar createCar() {
        return new LavidaCar();
    }
}
