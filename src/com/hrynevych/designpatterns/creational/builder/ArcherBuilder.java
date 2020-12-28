package com.hrynevych.designpatterns.creational.builder;

public class ArcherBuilder extends CharacterBuilder{

    @Override
    void buildWeapon() {
        character.setWeapon(Weapon.BOW);
    }

    @Override
    void buildArmor() {

    }

    @Override
    void buildShield() {

    }
}
