package com.hrynevych.designpatterns.creational.factory;

public class OrcCharacterFactory implements CharacterFactory{

    @Override
    public Character createCharacter() {
        return new Orc();
    }
}
