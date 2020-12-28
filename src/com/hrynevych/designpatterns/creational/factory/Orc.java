package com.hrynevych.designpatterns.creational.factory;

public class Orc implements Character {
    @Override
    public void introduction() {
        System.out.println("I am an orc");
    }

    @Override
    public void fight() {
        System.out.println("LOK'TAR OGAR");
    }
}
