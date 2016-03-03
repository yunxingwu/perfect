package com.star.perfect.pattern.builder.model;

/**
 * Created by  ŒÈ‘À–«  on   2016/1/12.
 */

public class Ticket {
    private String type;
    private String start;
    private String end;
    private float price;
    private int count;
    private String consumer;
    private String cID;
    private String time;
    private Ticket(Builder builder){
        this.type = builder.type;
        this.start = builder.start;
        this.end = builder.end;
        this.price = builder.price;
        this.cID = builder.cID;
        this.consumer = builder.consumer;
        this.count = builder.count;
        this.time = builder.time;
    }
    public static class Builder{
        public Ticket build(){
            return new Ticket(this);
        }
        private String type;
        private String start;
        private String end;
        private float price;
        private int count;
        private String consumer;
        private String cID;
        private String time;
        public Builder type(String type){
            this.type = type;
            return this;
        }

        public Builder start(String start) {
            this.start = start;
            return this;
        }

        public Builder end(String end) {
            this.end = end;
            return this;
        }

        public Builder price(float price) {
            this.price = price;
            return this;
        }

        public Builder count(int count) {
            this.count = count;
            return this;
        }

        public Builder consumer(String consumer) {
            this.consumer = consumer;
            return this;
        }

        public Builder cID(String cID) {
            this.cID = cID;
            return this;
        }

        public Builder time(String time) {
            this.time = time;
            return this;
        }
    }
    public String toString(){
        return "Ticket:"+this.consumer+" "+this.cID+" "+this.price+" "+this.count;
    }
}
