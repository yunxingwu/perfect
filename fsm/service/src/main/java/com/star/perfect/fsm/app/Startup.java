package com.star.perfect.fsm.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by  伍运星  on   2016/1/18.
 */

public class Startup {
    private static   ClassPathXmlApplicationContext context ;

    public void start(){
        context =  new ClassPathXmlApplicationContext("classpath:spring/application.xml");
        context.start();
        System.out.println("--------service is running--------");
    }

    public void stop(){
        context.stop();
    }

    public static void main(String[] args) throws IOException {
        Startup app = new Startup();
        app.start();
        System.in.read();
    }
}
