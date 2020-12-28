package com.hrynevych.designpatterns.creational.factory;

public class HumanCharacterFactory implements CharacterFactory {
    @Override
    public Character createCharacter() {
        return new Human();
    }
}
