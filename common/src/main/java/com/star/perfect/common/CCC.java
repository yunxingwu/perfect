package com.star.perfect.common;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by  伍运星  on   2016/2/1.
 */

public class CCC extends BBB {
    public String c;
    @Test
    public void testa(){
        t(123,222);
    }
    public void t(int... nums){
        System.out.println(nums.toString());
    }
    public void testc(String name,String id){
        System.out.println("name:"+name);
    }

    public static void main(String[] args)  {
        try {
            CCC c = new CCC();
            Method method = CCC.class.getDeclaredMethod("testc",String.class,String.class);
            method.invoke(c,"c","aa");
            System.out.println(method.getName());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
