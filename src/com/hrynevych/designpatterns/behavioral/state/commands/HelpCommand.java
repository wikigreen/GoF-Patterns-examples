package com.hrynevych.designpatterns.behavioral.state.commands;

import com.hrynevych.designpatterns.behavioral.state.Car;

public class HelpCommand extends Command {
    public HelpCommand(Car car) {
        super(car);
    }

    @Override
    public void execute() {
        System.out.println("List of commands: fuel, end_fuel, start, accelerate, stop, repair, turnOf, end");
    }
}
