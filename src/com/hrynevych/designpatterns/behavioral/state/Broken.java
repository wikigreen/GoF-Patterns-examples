package com.hrynevych.designpatterns.behavioral.state;

public class Broken implements State {
    private Car car;

    public Broken(Car car) {
        this.car = car;
    }

    @Override
    public void fuel() {
        System.out.println("I can not fuel broken car");
    }

    @Override
    public void endFuel() {
        System.out.println("I don`t fuel the car");
    }

    @Override
    public void start() {
        System.out.println("Car is broken, I can not turn on it");
    }

    @Override
    public void accelerate() {
        System.out.println("Don`t even try, it is turned of");
    }

    @Override
    public void stop() {
        System.out.println("The car is already stopped");
    }

    @Override
    public void repair() {
        System.out.println("I fixed it, now it can move");
        car.setState(new Ready(car));
    }

    @Override
    public void turnOf() {
        System.out.println("The car is not working");
    }
}
