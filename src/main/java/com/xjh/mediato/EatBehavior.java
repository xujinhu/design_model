package com.xjh.mediato;

public class EatBehavior extends ABehavior {

    @Override
    public void onEvent(AMediato mediato) {
        mediato.doEvent("eat");
    }

    public void doEat(){
        System.out.println("do eat");
    }
}
