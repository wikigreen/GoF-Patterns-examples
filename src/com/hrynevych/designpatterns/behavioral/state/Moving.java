package com.hrynevych.designpatterns.behavioral.state;

public class Moving implements State {
    private Car car;
    private int speed = 60;

    public Moving(Car car) {
        this.car = car;
    }

    @Override
    public void fuel() {
        System.out.println("To fuel the car you need to stop it first");
    }

    @Override
    public void endFuel() {
        System.out.println("I don`t fuel the car");
    }

    @Override
    public void start() {
        System.out.println("Tha car is already started");
    }

    @Override
    public void accelerate() {
        speed += 40;
        if(speed == 100)
            System.out.println("I am on the way, the speed is " + speed + " km per hour");
        else if(speed == 140)
            System.out.println("I am on the way, the speed is " + speed + " km per hour. Maybe I should drive slower..." );
        else if(speed >= 180){
            System.out.println("I have rode to fast and I have broken the car(");
            car.setState(new Broken(car));
        }

    }
    @Override
    public void stop() {
        System.out.println("Lets stop...");
        car.setState(new Ready(car));
    }

    @Override
    public void repair() {
        System.out.println("The car is not broken");
    }

    @Override
    public void turnOf() {
        System.out.println("The car is turned of");
    }
}
