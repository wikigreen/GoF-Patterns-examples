package com.hrynevych.designpatterns.behavioral.mediator;

public interface Operator {
    void connect(Caller caller, String receiver);
    void putCallers(Caller... callers);
}
