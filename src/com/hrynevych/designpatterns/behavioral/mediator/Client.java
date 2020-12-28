package com.hrynevych.designpatterns.behavioral.mediator;

public class Client {
    public static void main(String[] args) {
        Operator operator = new BasicOperator();
        Caller lifecellCaller = new MobileCaller(Country.UKRAINE, Network.LIFECELL, "8143591", operator);
        Caller telephoneCaller = new TelephoneCaller(Country.RUSSIAN_FEDERATION, City.MOSCOW, "3865421", operator);

        operator.putCallers(lifecellCaller, telephoneCaller);

        lifecellCaller.call(telephoneCaller);
    }
}
