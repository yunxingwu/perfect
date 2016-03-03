package com.star.perfect.common.exception;

/**
 * Created by  伍运星  on   2016/1/28.
 */

public class Myexception extends RuntimeException {
    public Myexception(){
        super();
        System.out.println("exception");
    }

    static class Segment<K,V>{

    }

    static class HashEntry<K,V>{
        final K k;
        final V v;
        HashEntry(K k,V v){
            this.k = k;
            this.v = v;
        }
    }
}
