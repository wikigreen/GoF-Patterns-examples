package com.hrynevych.designpatterns.creational.builder;

public class Game {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new NightBuilder());
        System.out.println(director.buildCharacter("Ivanhoe"));
        director.setBuilder(new VikingBuilder());
        System.out.println(director.buildCharacter("Thor"));
        director.setBuilder(new ArcherBuilder());
        System.out.println(director.buildCharacter("Robin Hood"));
        director.setBuilder(new SoldierBuilder());
        System.out.println(director.buildCharacter("SEAL"));
    }
}
