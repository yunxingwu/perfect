package com.star.perfect;

import com.star.perfect.common.exception.Myexception;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Stack;

/**
 * Created by  伍运星  on   2016/1/27.
 *  固定长度的数组实现队列功能
 */

public class Queue {
    private int []  array = new int[100];
    private int size = 0;
    public void put(int num){
        if(size>=100){
            System.out.println("队列已达上限");
            return;
        }
        array[size] = num;
        size++;
    }

    public int get(){
        if (size>0) {
            int v = array[0];
            for (int i = 0; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            size--;
            return v;
        }else {
            throw new Myexception();
        }
    }

    public void print(){
        for (int i = 0;i<array.length;i++){
            System.out.printf(String.valueOf(array[i]));
            System.out.printf(" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
//        Queue queue = new Queue();
////        queue.put(5);
////        queue.put(23);
////        queue.put(73);
////        queue.put(34);
////        queue.put(76);
////        queue.put(100);
////        queue.print();
//        System.out.println(queue.get());
//        System.out.println(queue.get());
//        System.out.println(queue.size);
        String str = "123";
        String str1 = "123";
        String str2 = new String();
        AAA a = new AAA();
        AAA a1 = new AAA();
        ArrayList list = new ArrayList();
        Stack<Integer> stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(2);
        System.out.println(stack.empty());
        System.out.println(stack.pop());
        System.out.println(stack);
//        System.out.println(list.size());
//        System.out.println(str2);
//        System.out.println(a.hashCode());
    }
}
