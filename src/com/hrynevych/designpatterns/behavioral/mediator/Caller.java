package com.hrynevych.designpatterns.behavioral.mediator;

public interface Caller {
    void call(Caller subject);
    void join(Caller caller);
    String getNumber();
}
