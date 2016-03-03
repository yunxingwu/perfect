package com.star.perfect.pattern.builder.games;

/**
 * Created by  ÎéÔËĞÇ  on   2016/1/12.
 */

public  class Hero {
     BaseData baseData;
     Skin skin;
     Skill skill;
    public String toString(){
        return "hero is :"+baseData.getName()+" skill:"+skill+" skin:"+skin;
    }
}
