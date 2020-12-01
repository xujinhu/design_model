package com.xjh.mediato;

public class MusicBehavior extends ABehavior {

    @Override
    public void onEvent(AMediato mediato) {
        mediato.doEvent("music");
    }

    public void doMusic(){
        System.out.println("听音乐");
    }
}
