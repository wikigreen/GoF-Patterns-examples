package com.hrynevych.designpatterns.creational.abstractfactory.humanparty;

import com.hrynevych.designpatterns.creational.abstractfactory.Healer;

public class HumanHealer implements Healer {
    @Override
    public void heal() {
        System.out.println("Someone injured?");
    }
}
