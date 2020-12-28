package com.hrynevych.designpatterns.creational.builder;

public class Character {
    private String name;
    private Weapon weapon = null;
    private Armor armor = null;
    private Shield shield = null;

    public Character(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public Shield getShield() {
        return shield;
    }

    public void setShield(Shield shield) {
        this.shield = shield;
    }

    public String toString(){
        String result = "Character '" + name + "'. Equipment: ";
        result += "Weapon: " + (weapon == null ? "No weapon, " : weapon.toString() + ", ");
        result += "Armor: " + (armor == null ? "No armor, " : armor.toString()+ ", ");
        result += "Shield: " + (shield == null ? "No shield" : shield.toString());
        return result;

    }
}
