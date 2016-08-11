package com.star.perfect.common.asyn;

import java.util.concurrent.*;

/**
 * Created by  wuyunxing on   2016/4/14.
 */

public class MyThread {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<String> f = executorService.submit(new MyCallable());
        try {
            System.out.println("not get");
            System.out.println("before:"+f.isDone());
            System.out.println("get:"+f.get());
            System.out.println("final"+f.isDone());
            executorService.shutdown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
