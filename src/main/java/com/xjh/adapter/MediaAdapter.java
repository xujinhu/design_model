package com.xjh.adapter;

public class MediaAdapter implements IMediaPlayer{

    private IAdvanceMediaPlay advanceMediaPlay;

    public MediaAdapter(String fileType){
        if(fileType.equalsIgnoreCase("lvc")){
            advanceMediaPlay = new LvcAdvanceMediaPlay();
        }
        if(fileType.equalsIgnoreCase("mp4")){
            advanceMediaPlay = new Mp4AdvanceMediaPlay();
        }
    }


    @Override
    public void play(String fileType, String fileName) {
        if(fileType.equalsIgnoreCase("lvc")){
            advanceMediaPlay.playLvc();
        }else if(fileType.equalsIgnoreCase("mp4")){
            advanceMediaPlay.playMp4();
        }else{
            System.out.println("not support file type");
        }
    }
}
