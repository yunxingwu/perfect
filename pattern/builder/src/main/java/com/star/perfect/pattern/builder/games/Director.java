package com.star.perfect.pattern.builder.games;

/**
 * Created by  ÎéÔËĞÇ  on   2016/1/12.
 */

public class Director {
    private Builder builder;
    Director(Builder builder){
        this.builder = builder;
    }
    public void createProduct(){
        builder.build();
        Hero hero = builder.getHero();
        System.out.println(hero);
    }

    public static void main(String[] args) {
        Builder builder = new HeroBuilder();
        Director director = new Director(builder);
        director.createProduct();
    }
}
