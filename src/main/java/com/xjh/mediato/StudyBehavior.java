package com.xjh.mediato;

public class StudyBehavior extends ABehavior {

    @Override
    public void onEvent(AMediato mediato) {
        mediato.doEvent("study");
    }

    public void doStudy(){
        System.out.println("学习");
    }
}
