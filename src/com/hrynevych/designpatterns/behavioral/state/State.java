package com.hrynevych.designpatterns.behavioral.state;

public interface State {
    void fuel();
    void endFuel();
    void start();
    void accelerate();
    void stop();
    void repair();
    void turnOf();
}
