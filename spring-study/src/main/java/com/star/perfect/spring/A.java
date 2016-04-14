package com.star.perfect.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by  伍运星  on   2016/3/31.
 */

public class A {

    @Autowired
    private B b2;

    public void testA(){
        b2.executeB();
    }


    public static void main(String[] args) {

    }

//    public B getB() {
//        return b;
//    }
//
//
//    @Qualifier("b")
//    public void setB(B b) {
//        this.b = b;
//    }
}
