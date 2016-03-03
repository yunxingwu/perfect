package com.star.perfect.common;

import com.star.perfect.AAA;

import java.lang.reflect.Field;

/**
 * Created by  伍运星  on   2016/1/28.
 */

public class BBB extends AAA{
    private String[] str;
    private String text;
    public AAA aaa;
    public void testb(){

    }

    public static void main(String[] args) throws  IllegalAccessException, InstantiationException {
        Class clz = BBB.class;
        System.out.println();
        Field[] fields = clz.getFields();
        Field[] fields1 = clz.getDeclaredFields();
        System.out.println("getfields nums:"+fields.length);
        System.out.println("getdeclaredfields nums:"+fields1.length);
        Object object = clz.newInstance();
        for (Field field:fields1){
            System.out.println(field.getName());
        }

        Field field = null;
        try {
            field = clz.getDeclaredField("str");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        System.out.println(field.getType().isArray());
        System.out.println(field.getName());
        field.setAccessible(true);
        field.set(object,new String[]{"1","2","3"});
        int[] o =(int[]) field.get(object);
        System.out.println(o[2]);
    }
}
