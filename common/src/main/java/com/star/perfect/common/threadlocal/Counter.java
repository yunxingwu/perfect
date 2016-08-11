package com.star.perfect.common.threadlocal;

/**
 * Created by  wuyunxing on   2016/8/10.
 */

public class Counter {
    private static ThreadLocal<Integer> numberC = new ThreadLocal<Integer>(){
        protected Integer initialValue(){
            return 0;
        }
    };
    private static int number = 0;
    public int getNumber(){
     numberC.set(numberC.get()+1);
//        number = number+1;
        return numberC.get();
    }
}
