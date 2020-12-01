package com.xjh.singleton;
/**
 * <p>Description: 懒汉式-双重校验锁</p>
 * @Date 2020-11-27
 * @author xujinhu
 */
public class LazySingleton {

    private volatile static LazySingleton instance = null;

    private LazySingleton() {
    }

    public static LazySingleton getInstance(){
        if(instance == null){
            synchronized(LazySingleton.class){
                if(instance == null){
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
