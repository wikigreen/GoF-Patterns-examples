package com.hrynevych.designpatterns.behavioral.state;

public class Ready implements State {
    private Car car;

    public Ready(Car car) {
        this.car = car;
    }

    @Override
    public void fuel() {
        System.out.println("Let`s fuel the car");
        car.setState(new Fueling(car));
    }

    @Override
    public void endFuel() {
        System.out.println("I don`t fuel the car");
    }

    @Override
    public void start() {
        System.out.println("The car is already started");
    }

    @Override
    public void accelerate() {
        System.out.println("Starting the trip...");
        car.setState(new Moving(car));
    }

    @Override
    public void stop() {
        System.out.println("The car is not moving");
    }

    @Override
    public void repair() {
        System.out.println("The car is not broken");
    }

    @Override
    public void turnOf() {
        System.out.println("Turning of the car...");
        car.setState(new TurnedOf(car));
    }
}
