package com.star.perfect.pattern.builder;

import com.star.perfect.pattern.builder.model.Ticket;

/**
 * Created by  ÎéÔËĞÇ  on   2016/1/12.
 */

public class Main {
    public static void main(String[] args) {
        Ticket ticket = new Ticket.Builder().consumer("yyy").build();
        System.out.println(ticket);
    }


}
