package com.star.perfect.common.asyn;

import java.util.concurrent.Callable;

/**
 * Created by  wuyunxing on   2016/4/14.
 */

public class MyCallable implements Callable <String>{
    public String  call() throws Exception {
        int i = 0;
        while (i<3){
            Thread.sleep(2000);
            System.out.println("do call");
            i++;
        }

        return "call";
    }
}
