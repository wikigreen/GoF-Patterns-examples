package com.hrynevych.designpatterns.creational.abstractfactory.humanparty;

import com.hrynevych.designpatterns.creational.abstractfactory.Warrior;

public class HumanWarrior implements Warrior {
    @Override
    public void attack() {
        System.out.println("For the Alliance!!!");
    }
}
