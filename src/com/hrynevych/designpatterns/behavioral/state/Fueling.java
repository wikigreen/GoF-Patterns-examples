package com.hrynevych.designpatterns.behavioral.state;


public class Fueling implements State {
    private Car car;

    public Fueling(Car car) {
        this.car = car;
    }

    @Override
    public void fuel() {
        System.out.println("Stop it! Fuel tank is overfilling!!!");
    }

    @Override
    public void endFuel() {
        System.out.println("Car is ready to move");
        car.setState(new Ready(car));
    }

    @Override
    public void start() {
        System.out.println("Oh no... You burned the car! You can try to repair it");
        car.setState(new Broken(car));
    }

    @Override
    public void accelerate() {
        System.out.println("Don`t even try, it is turned of");
    }

    @Override
    public void stop() {
        System.out.println("It`s already stopped");
    }

    @Override
    public void repair() {
        System.out.println("The car is not broken");
    }

    @Override
    public void turnOf() {
        System.out.println("The car is not working");
    }
}
