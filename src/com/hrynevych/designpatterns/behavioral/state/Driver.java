package com.hrynevych.designpatterns.behavioral.state;

import com.hrynevych.designpatterns.behavioral.state.commands.*;

import java.util.Scanner;

public class Driver {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hello, let`s take a ride, type 'help' to see all commands: ");
        Car car = new Car();
        car.setState(new TurnedOf(car));
        Command command = null;
        do{
            command = getCommand(SCANNER.nextLine(), car);
            command.execute();
        } while (!(command instanceof EndCommand));
    }

    public static Command getCommand(String command, Car car){
        return switch (command){
            case "fuel": yield new FuelCommand(car);
            case "end_fuel": yield new EndFuelCommand(car);
            case "start": yield new StartCommand(car);
            case "accelerate": yield new AccelerateCommand(car);
            case "stop": yield new StopCommand(car);
            case "repair": yield new RepairCommand(car);
            case "turnOf": yield new TurnOfCommand(car);
            case "help": yield new HelpCommand(car);
            case "end": yield new EndCommand(null);
            default: yield new NotSupportedCommand(command);
        };

    }
}
