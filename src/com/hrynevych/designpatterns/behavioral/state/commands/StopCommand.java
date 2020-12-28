package com.hrynevych.designpatterns.behavioral.state.commands;

import com.hrynevych.designpatterns.behavioral.state.Car;

public class StopCommand extends Command {
    public StopCommand(Car car) {
        super(car);
    }

    @Override
    public void execute() {
        car.stop();
    }
}
