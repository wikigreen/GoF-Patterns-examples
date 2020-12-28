package com.hrynevych.designpatterns.creational.abstractfactory;

import com.hrynevych.designpatterns.creational.abstractfactory.orcparty.OrcPartyFactory;

public class Game {
    public static void main(String[] args) {
        AbstractPartyFactory partyFactory = new OrcPartyFactory();
        //AbstractPartyFactory partyFactory = new HumanPartyFactory();
        Healer healer = partyFactory.getHealer();
        Warrior warrior = partyFactory.getWarrior();
        Hunter hunter = partyFactory.getHunter();

        warrior.attack();
        hunter.shoot();
        healer.heal();
    }
}
