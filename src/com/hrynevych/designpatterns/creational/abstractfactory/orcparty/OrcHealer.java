package com.hrynevych.designpatterns.creational.abstractfactory.orcparty;

import com.hrynevych.designpatterns.creational.abstractfactory.Healer;

public class OrcHealer implements Healer {
    @Override
    public void heal() {
        System.out.println("Healing using totems...");
    }
}
