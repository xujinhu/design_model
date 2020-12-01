package com.xjh.mediato;

public class ConCreateMediato extends AMediato {

    private EatBehavior eatBehavior;

    private MusicBehavior musicBehavior;

    private StudyBehavior studyBehavior;

    private TiktokBehavior tiktokBehavior;

    public ConCreateMediato(EatBehavior eatBehavior, MusicBehavior musicBehavior, StudyBehavior studyBehavior, TiktokBehavior tiktokBehavior) {
        this.eatBehavior = eatBehavior;
        this.musicBehavior = musicBehavior;
        this.studyBehavior = studyBehavior;
        this.tiktokBehavior = tiktokBehavior;
    }

    @Override
    public void doEvent(String eventType) {
        switch (eventType){
            case  "eat" : {
                musicBehavior.doMusic();
                studyBehavior.doStudy();
                break;
            }
            case "study" :{
                musicBehavior.doMusic();
                tiktokBehavior.doTiktok();
                break;
            }
            case "music" :{
                eatBehavior.doEat();
                break;
            }
            case "tiktok":{
                studyBehavior.doStudy();
                break;
            }
            default:
                System.out.println("啥也不干");
        }
    }
}
