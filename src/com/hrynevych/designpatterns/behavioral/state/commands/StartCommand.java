package com.hrynevych.designpatterns.behavioral.state.commands;

import com.hrynevych.designpatterns.behavioral.state.Car;

public class StartCommand extends Command {
    public StartCommand(Car car) {
        super(car);
    }

    @Override
    public void execute() {
        car.start();
    }
}
