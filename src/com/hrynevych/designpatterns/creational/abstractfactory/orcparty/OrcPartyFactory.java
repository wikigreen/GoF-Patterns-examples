package com.hrynevych.designpatterns.creational.abstractfactory.orcparty;

import com.hrynevych.designpatterns.creational.abstractfactory.AbstractPartyFactory;
import com.hrynevych.designpatterns.creational.abstractfactory.Healer;
import com.hrynevych.designpatterns.creational.abstractfactory.Hunter;
import com.hrynevych.designpatterns.creational.abstractfactory.Warrior;

public class OrcPartyFactory implements AbstractPartyFactory {
    @Override
    public Hunter getHunter() {
        return new OrcHunter();
    }

    @Override
    public Warrior getWarrior() {
        return new OrcWarrior();
    }

    @Override
    public Healer getHealer() {
        return new OrcHealer();
    }
}
