package com.hrynevych.designpatterns.creational.singleton;

import java.util.ArrayList;
import java.util.List;

public class GameMap {
    private static GameMap instance;
    private List<Location> locations = new ArrayList<>();
    private int length;
    private int width;

    private GameMap() {
    }

    public static GameMap getInstance(){
        if(instance == null){
            instance = new GameMap();
        }
        return instance;
    }

    public void addLocation(String name, int level){
        locations.add(new Location(name, level));
    }

    public String toString(){
        String info = "List of locations:\n";
        info += locations.stream().map(Location::toString)
                .map(str -> str+="\n")
                .reduce((prev, current) -> prev + current)
                .orElse("No locations yet");
        return info;
    }


    private class Location {
        String name;
        int level;

        public Location(String name, int level) {
            this.name = name;
            this.level = level;
        }

        @Override
        public String toString() {
            return "Location{" +
                    "name='" + name + '\'' +
                    ", level=" + level +
                    '}';
        }
    }
}
