package com.star.perfect.pattern.builder.spi;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * Created by  ÎéÔËĞÇ  on   2016/1/13.
 * ²âÊÔjava spi»úÖÆ
 */

public class Client {
    public static void main(String[] args) {
//        Builder builder = new GamesBuilder();
        ServiceLoader<Builder>builders = ServiceLoader.load(Builder.class);
        Iterator iterator = builders.iterator();
        while (iterator.hasNext()){
            Builder builder = (Builder) iterator.next();
            builder.build();
        }
    }
}
