package com.hrynevych.designpatterns.creational.builder;

public class Director {
    CharacterBuilder builder;

    public void setBuilder(CharacterBuilder builder){
        this.builder = builder;
    }

    public Character buildCharacter(String name){
        builder.createCharacter(name);
        builder.buildArmor();
        builder.buildShield();
        builder.buildWeapon();
        return builder.getCharacter();
    }

}
