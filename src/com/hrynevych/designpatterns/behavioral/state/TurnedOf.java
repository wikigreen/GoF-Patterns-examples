package com.hrynevych.designpatterns.behavioral.state;


public class TurnedOf implements State{
    private Car car;

    public TurnedOf(Car car){
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
        System.out.println("Starting the car...");
        car.setState(new Ready(car));
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
        System.out.println("The car is not broken");
    }

    @Override
    public void turnOf() {
        System.out.println("The car is not working");
    }
}
