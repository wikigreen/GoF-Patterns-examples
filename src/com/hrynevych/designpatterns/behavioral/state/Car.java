package com.hrynevych.designpatterns.behavioral.state;

public class Car {
    State state;

    public void setState(State state){
        this.state = state;
    }

    public void fuel(){
        state.fuel();
    }

    public void endFuel(){
        state.endFuel();
    }

    public void start(){
        state.start();
    }

    public void accelerate(){
        state.accelerate();
    }

    public void stop(){
        state.stop();
    }

    public void repair(){
        state.repair();
    }

    public void turnOf(){
        state.turnOf();
    }

}
