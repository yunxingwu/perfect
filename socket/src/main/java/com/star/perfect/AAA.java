package com.star.perfect;

import java.math.BigDecimal;

/**
 * Created by  伍运星  on   2016/1/25.
 */

public class AAA {
    public   void test1(){
        synchronized (AAA.class) {
            int i = 5;
            while (i > 0) {
                System.out.println("test1 i = :" + i);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                i--;
            }
        }
    }

    public static synchronized   void test2(){
        int i = 1;
        while (i<=5){
            System.out.println("test2 i =:"+i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
    public static void main(String[] args) {
        final AAA a = new AAA();
        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                a.test1();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                a.test2();
            }
        });
        thread1.start();
        thread2.start();

    }

}
