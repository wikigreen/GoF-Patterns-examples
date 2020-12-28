package com.hrynevych.designpatterns.behavioral.memento;

public class Game {
    public static void main(String[] args) {
        Character character = new Character("Hunter");
        System.out.println(character.toString());
        character.lvlUp();
        System.out.println("Character got level " + character.getLevel() + "!");
        System.out.println(character.toString());
        character.lvlUp();
        System.out.println("Character got level " + character.getLevel() + "!");
        System.out.println(character.toString());
        System.out.println("Saving character...");
        Save save = character.save();
        character.lvlUp();
        System.out.println("Character got level " + character.getLevel() + "!");
        System.out.println(character.toString());
        character.buySomething(character.getMoney());
        System.out.println("Character spent all money :( ");
        System.out.println(character.toString());

        System.out.println("Loading last save...");

        character.loadSave(save);

        System.out.println("Character after loading last save: ");
        System.out.println(character);
    }
}
