package com.hrynevych.designpatterns.behavioral.mediator;

public class MobileCaller implements Caller {
    private final String mobileNumber;
    private final Operator operator;

    public MobileCaller(Country country, Network network, String mobileNumber, Operator operator) {
        this.mobileNumber = country.getCode() + network.getCode() + mobileNumber;
        this.operator = operator;
    }

    @Override
    public void call(Caller subject) {
        System.out.println("Mobile subscriber with number " + this.getNumber() + " is calling to subscriber with number " + subject.getNumber() + " ...");
        operator.connect(this, subject.getNumber());
    }

    @Override
    public void join(Caller caller) {
        System.out.println("Mobile subscriber with number " + this.getNumber() + " is joining to conversation with number " + caller.getNumber() + " ...");
    }

    @Override
    public String getNumber() {
        return mobileNumber;
    }
}
