package com.hrynevych.designpatterns.creational.builder;

public enum Armor {
    PLATE_ARMOUR("Plate armor"), CHAIN_MAIL("Chain mail"), BULLETPROOF_VEST("Bulletproof vest");

    private String name;
    Armor(String name) {
        this.name = name;
    }

    public String toString(){
        return name;
    }
}
