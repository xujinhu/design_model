package com.xjh.singleton;
/**
 * <p>Description: 饿汉式</p>
 * @Date 2020-11-27
 * @author xujinhu
 */
public class HungrySingleton {

    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance(){
        return instance;
    }
}
