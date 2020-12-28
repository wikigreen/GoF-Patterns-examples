package com.hrynevych.designpatterns.behavioral.state.commands;

import com.hrynevych.designpatterns.behavioral.state.Car;

public class RepairCommand extends Command {
    public RepairCommand(Car car) {
        super(car);
    }

    @Override
    public void execute() {
        car.repair();
    }
}
