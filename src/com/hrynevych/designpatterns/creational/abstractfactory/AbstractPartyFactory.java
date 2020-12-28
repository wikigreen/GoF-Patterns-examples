package com.hrynevych.designpatterns.creational.abstractfactory;

public interface AbstractPartyFactory {
    Hunter getHunter();
    Warrior getWarrior();
    Healer getHealer();
}
