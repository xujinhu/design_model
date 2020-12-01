package com.xjh;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableTest implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "返回值";
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask task = new FutureTask(new CallableTest());
        new Thread(task).start();
        System.out.println(task.get());  //get方法里,会自旋,阻塞等待结果..
    }
}
