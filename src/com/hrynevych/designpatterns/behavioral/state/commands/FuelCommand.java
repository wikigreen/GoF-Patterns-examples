package com.hrynevych.designpatterns.behavioral.state.commands;

import com.hrynevych.designpatterns.behavioral.state.Car;

public class FuelCommand extends Command {
    public FuelCommand(Car car) {
        super(car);
    }

    @Override
    public void execute() {
        car.fuel();
    }
}
