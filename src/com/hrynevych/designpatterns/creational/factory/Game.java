package com.hrynevych.designpatterns.creational.factory;

public class Game {
    public static void main(String[] args) {
        CharacterFactory characterFactory = createCharacterByRace("orc");
        Character character = characterFactory.createCharacter();

        character.introduction();
        character.fight();
    }

    static CharacterFactory createCharacterByRace(String race){
        return switch (race.toLowerCase()) {
            case "human":
                yield new HumanCharacterFactory();
            case "elf":
                yield new ElfCharacterFactory();
            case "orc":
                yield new OrcCharacterFactory();
            default:
                throw new IllegalArgumentException("Race '" + race + "' is not supported");
        };
    }
}
