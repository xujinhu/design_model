package com.xjh.mediato;

public class MediatoDemoTest {

    public static void main(String[] args) {

        //各种行为
        EatBehavior eatBehavior = new EatBehavior();
        MusicBehavior musicBehavior = new MusicBehavior();
        StudyBehavior studyBehavior = new StudyBehavior();
        TiktokBehavior tiktokBehavior = new TiktokBehavior();

        //中介(调节者)
        AMediato mediato = new ConCreateMediato(eatBehavior,musicBehavior,studyBehavior,tiktokBehavior);

        //一种行为触发的其他行为
        studyBehavior.onEvent(mediato);

    }
}
