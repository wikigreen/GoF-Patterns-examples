package com.hrynevych.designpatterns.creational.builder;

public class NightBuilder extends CharacterBuilder {
    @Override
    public void buildWeapon() {
        character.setWeapon(Weapon.SWORD);
    }

    @Override
    public void buildArmor() {
        character.setArmor(Armor.PLATE_ARMOUR);
    }

    @Override
    public void buildShield() {
        character.setShield(Shield.IRON_SHIELD);
    }
}
