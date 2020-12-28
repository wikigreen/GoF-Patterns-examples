package com.hrynevych.designpatterns.behavioral.mediator;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BasicOperator implements Operator{
    private final Map<String, Caller> callers;

    public BasicOperator(Map<String, Caller> callers) {
        this.callers = callers;
    }

    public BasicOperator(Caller... callers) {
        this.callers = new HashMap<>();
        Arrays.stream(callers).forEach(caller -> this.callers.put(caller.getNumber(), caller));
    }

    public void putCallers(Caller... callers){
        Arrays.stream(callers).forEach(caller -> this.callers.put(caller.getNumber(), caller));
    }


    @Override
    public void connect(Caller caller, String receiver) {
        if(!callers.containsKey(receiver)){
            System.out.println("Number " + receiver + " does not exist");
            return;
        }
        Caller subject = callers.get(receiver);
        caller.join(subject);
        subject.join(caller);

    }
}
