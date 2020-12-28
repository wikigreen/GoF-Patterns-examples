package com.hrynevych.designpatterns.behavioral.state.commands;

import com.hrynevych.designpatterns.behavioral.state.Car;

public class EndFuelCommand extends Command {
    public EndFuelCommand(Car car) {
        super(car);
    }

    @Override
    public void execute() {
        car.endFuel();
    }
}
