package com.xjh.mediato;

public class TiktokBehavior extends ABehavior {

    @Override
    public void onEvent(AMediato mediato) {
        mediato.doEvent("tiktok");
    }

    public void doTiktok(){
        System.out.println("do tiktok");
    }
}
