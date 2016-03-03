package com.star.perfect.pattern.builder.util;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by  ������  on   2016/1/12.
 */

public class MyMap {
    public static<K,V>Map<K,V> createMap(){
        return new HashMap<K, V>();
    }

    public static void change(String string){
        string = "bbb";
    }

    public static void main(String[] args) {
        String aaa = "aaa";
        change(aaa);
        System.out.println(aaa);
    }
}
