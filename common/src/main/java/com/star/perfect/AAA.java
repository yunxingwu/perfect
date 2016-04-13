package com.star.perfect;

import com.star.perfect.common.annotation.PhoneName;
import com.star.perfect.common.annotation.PhoneUtil;
import lombok.Getter;
import lombok.Setter;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by  伍运星  on   2016/1/28.
 */

public class AAA {
    @Getter
    @Setter
    @PhoneName(value = "apple")
    private String phoneName;
    public String a;
    public void test(int i){
        System.out.println("aaa:"+i);
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
      Class cla = AAA.class;
        Object o = cla.newInstance();
        Method method = cla.getDeclaredMethod("test",Integer.TYPE);
        for (int i = 1;i<17;i++){
            method.invoke(o,i);
        }
    }
}
