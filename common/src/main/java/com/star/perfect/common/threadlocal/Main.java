package com.star.perfect.common.threadlocal;

/**
 * Created by  wuyunxing on   2016/5/6.
 */

public class Main {
    public static void main(String[] args) {
//        for (int i = 1; i <= 3; i++) {
//            new Thread(new Runnable() {
//                public void run() {
//                    Info info = Info.getInfo();
//                    System.out.println(info);
//                }
//            }).start();
//        }
        Counter counter = new Counter();
        MyThread myThread = new MyThread(counter);
        MyThread myThread1 = new MyThread(counter);
        MyThread myThread2 = new MyThread(counter);
        new Thread(myThread).start();
        new Thread(myThread1).start();;
        new Thread(myThread2).start();
    }
}
