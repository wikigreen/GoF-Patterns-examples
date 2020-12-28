package com.hrynevych.designpatterns.behavioral.state.commands;

import com.hrynevych.designpatterns.behavioral.state.Car;

public class TurnOfCommand extends Command {
    public TurnOfCommand(Car car) {
        super(car);
    }

    @Override
    public void execute() {
        car.turnOf();
    }
}
