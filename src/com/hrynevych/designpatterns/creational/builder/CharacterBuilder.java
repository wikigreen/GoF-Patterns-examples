package com.hrynevych.designpatterns.creational.builder;

public abstract class CharacterBuilder {
    Character character;

    void createCharacter(String name){
        this.character = new Character(name);
    }

    abstract void buildWeapon();

    abstract  void buildArmor();

    abstract void buildShield();

    public Character getCharacter(){
        return character;
    }


}
