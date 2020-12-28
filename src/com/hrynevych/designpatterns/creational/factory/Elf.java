package com.hrynevych.designpatterns.creational.factory;

public class Elf implements Character{
    @Override
    public void introduction() {
        System.out.println("I am an elf");
    }

    @Override
    public void fight() {
        System.out.println("Nice shoot");
    }
}
