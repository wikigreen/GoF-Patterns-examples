package com.hrynevych.designpatterns.creational.abstractfactory.orcparty;

import com.hrynevych.designpatterns.creational.abstractfactory.Warrior;

public class OrcWarrior implements Warrior {
    @Override
    public void attack() {
        System.out.println("For the horde!!!");
    }
}
