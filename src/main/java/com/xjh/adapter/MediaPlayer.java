package com.xjh.adapter;

import com.xjh.adapter.IMediaPlayer;

public class MediaPlayer implements IMediaPlayer {

    private MediaAdapter mediaAdapter;

    @Override
    public void play(String fileType, String fileName) {
        if(fileType.equalsIgnoreCase("mp3")){
            System.out.println("MediaPlayer...play mp3...");
        }else if(fileType.equalsIgnoreCase("mp4") || fileType.equalsIgnoreCase("lvc")){
            mediaAdapter = new MediaAdapter(fileType);
            mediaAdapter.play(fileType, fileName);
        }else{
            System.out.println("MediaPlayer...no support this fileType" + fileType);
        }
    }
}
