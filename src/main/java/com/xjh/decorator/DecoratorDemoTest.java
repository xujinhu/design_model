package com.xjh.decorator;

public class DecoratorDemoTest {

    public static void main(String[] args) {
        //杂粮煎饼
        IPancake pancake = new CoarsePancake();
        //火腿-装饰着
        pancake = new HamDecoratory(pancake);
        //辣条-装饰者
        pancake = new LaTiaoDecoratory(pancake);
        System.out.println(pancake.cost());
    }
}
