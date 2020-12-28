package com.hrynevych.designpatterns.behavioral.state.commands;

import com.hrynevych.designpatterns.behavioral.state.Car;

public abstract class Command {
    protected Car car;

    public Command(Car car) {
        this.car = car;
    }

    public abstract void execute();
}
