package com.hrynevych.designpatterns.creational.factory;

public class Human implements Character{
    @Override
    public void introduction() {
        System.out.println("I am a human");
    }

    @Override
    public void fight() {
        System.out.println("For the Alliance!!!");
    }
}
