package com.hrynevych.designpatterns.creational.builder;

public enum  Weapon {
    SWORD("Sword"), AXE("Axe"), BOW("Bow"), RIFLE("Rifle");

    private String name;
    Weapon(String name) {
        this.name = name;
    }

    public String toString(){
        return name;
    }
}
