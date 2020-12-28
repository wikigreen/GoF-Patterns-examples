package com.hrynevych.designpatterns.creational.builder;

public enum Shield {
    WOODEN_SHIELD("Wooden shield"), IRON_SHIELD("Iron shield");

    private String name;
    Shield(String name) {
        this.name = name;
    }

    public String toString(){
        return name;
    }


}
