package com.star.perfect.common.threadlocal;

/**
 * Created by  wuyunxing on   2016/5/6.
 */

public class Info {
    private String name;

    private static ThreadLocal<Info> local = new ThreadLocal<Info>(){
        public  Info initialValue(){
            return new Info();
        }
    };

    public static  Info getInfo(){
        return local.get();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
