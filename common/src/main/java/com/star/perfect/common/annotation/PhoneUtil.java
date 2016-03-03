package com.star.perfect.common.annotation;

import java.lang.reflect.Field;

/**
 * Created by  伍运星  on   2016/1/29.
 */

public class PhoneUtil {
    public static void getPhoneInfo(Class<?>clazz){
        Field[] fields = clazz.getDeclaredFields();
        System.out.println(fields);
        for (Field field:fields){
            if(field.isAnnotationPresent(PhoneName.class)){
                PhoneName phoneName = field.getAnnotation(PhoneName.class);
                System.out.println(phoneName.value());
            }
        }

    }
}
