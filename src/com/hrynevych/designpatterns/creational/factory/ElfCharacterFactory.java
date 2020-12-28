package com.hrynevych.designpatterns.creational.factory;

public class ElfCharacterFactory implements CharacterFactory {
    @Override
    public Character createCharacter() {
        return new Elf();
    }
}
