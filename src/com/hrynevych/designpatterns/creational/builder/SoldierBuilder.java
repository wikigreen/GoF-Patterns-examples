package com.hrynevych.designpatterns.creational.builder;

public class SoldierBuilder extends CharacterBuilder {
    @Override
    void buildWeapon() {
        character.setWeapon(Weapon.RIFLE);
    }

    @Override
    void buildArmor() {
        character.setArmor(Armor.BULLETPROOF_VEST);
    }

    @Override
    void buildShield() {

    }
}
