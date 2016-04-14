package com.star.perfect;

import com.star.perfect.spring.A;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by  伍运星  on   2016/3/31.
 */

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/application.xml");
//        context.getBean("initbean");
        context.start();
        A a = (A)context.getBean("a");
        a.testA();
    }
}
