package com.xjh.simplefactory;
/**
 * <p>Description: 大众车简单工程类</p>
 * @Date 2020-12-01
 * @author xujinhu
 */
public class PublicCarFactory {

    public IPublicCar createCar(int type){
        if(type == 1){
            return new LavidaCar();
        }else if(type ==2){
            return new SantanaCar();
        }
        return null;
    }
}
