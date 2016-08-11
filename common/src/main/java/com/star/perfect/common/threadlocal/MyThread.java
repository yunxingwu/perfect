package com.star.perfect.common.threadlocal;

/**
 * Created by  wuyunxing on   2016/8/10.
 */

public class MyThread implements Runnable {
    private Counter counter;
    public MyThread(Counter counter){
        this.counter = counter;
    }
    public void run() {
        for (int i=0;i<3;i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "   " + counter.getNumber());
        }
    }
}
