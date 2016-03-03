package com.star.perfect.pattern.builder.games;

/**
 * Created by  ŒÈ‘À–«  on   2016/1/12.
 */

public class RedSkin implements Skin {
    private String skinName;
    RedSkin(String name){
        this.skinName = name;
    }
    public void excuSkin(){
        System.out.println("excute red skin!");
    }

    public String getSkinName() {
        return skinName;
    }

    public void setSkinName(String skinName) {
        this.skinName = skinName;
    }
    public String toString(){
        return this.getSkinName();
    }
}
