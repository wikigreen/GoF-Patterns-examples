package com.hrynevych.designpatterns.creational.abstractfactory.humanparty;

import com.hrynevych.designpatterns.creational.abstractfactory.Hunter;

public class HumanHunter implements Hunter {
    @Override
    public void shoot() {
        System.out.println("'BOOM!!!' That was loud!");
    }
}
