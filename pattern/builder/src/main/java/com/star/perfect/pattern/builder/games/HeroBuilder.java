package com.star.perfect.pattern.builder.games;

import com.star.perfect.pattern.builder.model.Ticket;

/**
 * Created by  ÎéÔËĞÇ  on   2016/1/12.
 */

public class HeroBuilder implements Builder{
    Hero hero = new Hero();
    public void buildSkin(){
        this.hero.skin = new RedSkin("red");
    }
    public void buildSkill(){
        this.hero.skill = new RunSkill("run");
    }
    public void buildBaseData(){
       this.hero.baseData = new BaseData("star");
    }

    public void build() {
        buildBaseData();
        buildSkill();
        buildSkin();
    }

    public Hero getHero() {
        return this.hero;
    }
}
