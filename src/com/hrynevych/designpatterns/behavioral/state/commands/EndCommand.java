package com.hrynevych.designpatterns.behavioral.state.commands;

import com.hrynevych.designpatterns.behavioral.state.Car;

public class EndCommand extends Command {
    public EndCommand(Car car) {
        super(null);
    }

    @Override
    public void execute() {
        System.out.println("See you!");
    }
}
