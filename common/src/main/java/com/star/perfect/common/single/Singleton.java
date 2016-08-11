package com.star.perfect.common.single;

/**
 * Created by  wuyunxing on   2016/8/11.
 */

public enum  Singleton {
    INSTANCE("chinese");
    Singleton(String name){
        this.name = name;
    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        System.out.println(Singleton.INSTANCE.getName());
    }
}
