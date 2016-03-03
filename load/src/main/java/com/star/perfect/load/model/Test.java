package com.star.perfect.load.model;

/**
 * Created by  ÎéÔËĞÇ  on   2016/1/14.
 */

public class Test {
    static {
        System.out.println("load test");
    }
    public Test(){
        System.out.println("construtor test");
    }
    public void test1(){};
    public void test2(){};
    public void test3(){};
    public void test(){
        class AAA{
            public void atest(){
                class BBB{

                }
            };
        }
    }
}
