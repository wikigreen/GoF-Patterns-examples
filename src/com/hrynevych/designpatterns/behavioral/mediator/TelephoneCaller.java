package com.hrynevych.designpatterns.behavioral.mediator;

public class TelephoneCaller implements Caller{
    private final String number;
    private final Operator operator;

    public TelephoneCaller(Country country, City city, String number, Operator operator) {
        this.number = country.getCode() + city.getCode() + number;
        this.operator = operator;
    }

    @Override
    public void call(Caller subject) {
        System.out.println("Telephone subscriber with number " + this.getNumber() + " is calling to subscriber with number " + subject.getNumber() + " ...");
        operator.connect(this, subject.getNumber());
    }

    @Override
    public void join(Caller caller) {
        System.out.println("Telephone subscriber with number " + this.getNumber() + " is joining to conversation with number " + caller.getNumber() + " ...");
    }

    @Override
    public String getNumber() {
        return number;
    }
}
