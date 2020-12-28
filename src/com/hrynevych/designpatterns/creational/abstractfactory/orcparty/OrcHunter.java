package com.hrynevych.designpatterns.creational.abstractfactory.orcparty;

import com.hrynevych.designpatterns.creational.abstractfactory.Hunter;

public class OrcHunter implements Hunter {
    @Override
    public void shoot() {
        System.out.println("I will hunt you down!!!");
    }
}
