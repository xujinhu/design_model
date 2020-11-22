package com.xjh.adapter;

public class LvcAdvanceMediaPlay implements IAdvanceMediaPlay {
    @Override
    public void playLvc() {
        System.out.println("LvcAdvanceMediaPlay play lvc!!!");
    }

    @Override
    public void playMp4() {
        System.out.println("nothing to do!!!");
    }
}
