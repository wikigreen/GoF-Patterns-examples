package com.hrynevych.designpatterns.creational.singleton;

public class Game {
    public static void main(String[] args) {
        System.out.println(GameMap.getInstance());
        System.out.println(GameMap.getInstance());
        System.out.println(GameMap.getInstance());
        System.out.println(GameMap.getInstance());
        System.out.println(GameMap.getInstance());
        System.out.println();
        GameMap.getInstance().addLocation("Uldaman", 42);
        GameMap.getInstance().addLocation("Stormwind", 1);
        GameMap.getInstance().addLocation("Naxxramas", 60);
        System.out.println(GameMap.getInstance().toString());
    }
}
