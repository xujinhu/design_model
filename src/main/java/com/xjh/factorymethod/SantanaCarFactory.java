package com.xjh.factorymethod;

/**
 * <p>Description: 桑塔纳工厂类</p>
 * @Date 2020-12-01
 * @author xujinhu
 */
public class SantanaCarFactory extends PublicCarFatory {

    @Override
    public IPublicCar createCar() {
        return new SantanaCar();
    }
}
