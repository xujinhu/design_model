package com.xjh.template;
/**
 * <p>Description: 模板模式 : 简单模拟自己写过的团长 领取任务奖励</p>
 * @Date 2020-12-01
 * @author xujinhu
 */
public abstract class ReceiveAwardTemplate {

    /**
     * <p>Description: 模板方法</p>
     * @Date 2020-12-01
     * @author xujinhu
     */
    protected final boolean receiveAward(int taskType){
        //第一步:校验登录
        boolean isLoin = verifyLogin();
        if(!isLoin){
            return false;
        }
        //第二步:校验任务的状态
        boolean isStateRight = verifyState(taskType);
        if(!isStateRight){
            return false;
        }
        //第三步:领取奖励
        return doReceive(taskType);
    }

    /**
     * <p>Description: 校验登录</p>
     * @Date 2020-12-01
     * @author xujinhu
     */
    protected boolean verifyLogin(){
        System.out.println("校验登录/身份等");
        return true;
    }

    /**
     * <p>Description: 校验任务的状态</p>
     * @Date 2020-12-01
     * @author xujinhu
     */
    public abstract boolean verifyState(int taskType);


    /**
     * <p>Description: 领取奖励动作</p>
     * @Date 2020-12-01
     * @author xujinhu
     */
    public abstract boolean doReceive(int taskType);

}
