package com.hrynevych.designpatterns.creational.abstractfactory.humanparty;

import com.hrynevych.designpatterns.creational.abstractfactory.AbstractPartyFactory;
import com.hrynevych.designpatterns.creational.abstractfactory.Healer;
import com.hrynevych.designpatterns.creational.abstractfactory.Hunter;
import com.hrynevych.designpatterns.creational.abstractfactory.Warrior;

public class HumanPartyFactory implements AbstractPartyFactory {
    @Override
    public Hunter getHunter() {
        return new HumanHunter();
    }

    @Override
    public Warrior getWarrior() {
        return new HumanWarrior();
    }

    @Override
    public Healer getHealer() {
        return new HumanHealer();
    }
}
