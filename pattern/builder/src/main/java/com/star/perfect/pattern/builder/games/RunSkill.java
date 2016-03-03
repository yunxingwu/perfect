package com.star.perfect.pattern.builder.games;

/**
 * Created by  ŒÈ‘À–«  on   2016/1/12.
 */

public class RunSkill implements Skill {
    private String skillName;
    RunSkill(String name){
        this.skillName = name;
    }
    public void exceSkill(){
        System.out.println("do run skill!");
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }
    public String toString(){
        return this.getSkillName();
    }
}
