package com.hrynevych.designpatterns.behavioral.state.commands;

import com.hrynevych.designpatterns.behavioral.state.Car;

public class AccelerateCommand extends Command{

    public AccelerateCommand(Car car) {
        super(car);
    }

    @Override
    public void execute() {
        car.accelerate();
    }
}
