package com.xjh.adapter;

public class AdapterDemoTest {

    public static void main(String[] args) {
        IMediaPlayer mediaPlayer = new MediaPlayer();

        mediaPlayer.play("mp3", "xxx");
        mediaPlayer.play("mp4", "xxx");
        mediaPlayer.play("lvc", "xxx");
        mediaPlayer.play("other", "xxx");
    }
}
