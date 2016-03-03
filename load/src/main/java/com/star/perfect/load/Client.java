package com.star.perfect.load;

import com.star.perfect.load.model.Test;

import java.lang.reflect.Constructor;

/**
 * Created by  ŒÈ‘À–«  on   2016/1/14.
 */

public class Client {
    public static void main(String[] args) throws ClassNotFoundException {
        ClassLoader classLoader = Client.class.getClassLoader();
        System.out.println("before load");
        Class cl = classLoader.loadClass("com.star.perfect.load.model.Test");
        System.out.println("after load");

        Class cl1 = Class.forName("com.star.perfect.load.model.Test",false,classLoader);
        Constructor[] constructors = cl.getConstructors();
        for (int i = 0;i<constructors.length;i++){
            Constructor constructor = constructors[i];
            System.out.println(constructor.toString());
        }



//        System.out.println(test.getClass().getClassLoader());
//        System.out.println(test.getClass().getClassLoader().getParent());
//        System.out.println(test.getClass());
//        System.out.println(Test.class);
    }
}
