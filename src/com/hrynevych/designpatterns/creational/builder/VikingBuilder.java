package com.hrynevych.designpatterns.creational.builder;

public class VikingBuilder extends CharacterBuilder{
    @Override
    void buildWeapon() {
        character.setWeapon(Weapon.AXE);
    }

    @Override
    void buildArmor() {
        character.setArmor(Armor.CHAIN_MAIL);
    }

    @Override
    void buildShield() {
        character.setShield(Shield.WOODEN_SHIELD);
    }
}
