package com.xjh.template;

public class OrderMoneyReceiveAward extends ReceiveAwardTemplate {

    @Override
    public boolean verifyState(int taskType) {
        //略
        return false;
    }

    @Override
    public boolean doReceive(int taskType) {
        //略
        return false;
    }
}
