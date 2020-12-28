package com.hrynevych.designpatterns.behavioral.mediator;

public enum City {
    KIEV("44"), MOSCOW("495");
    private final String code;

    City(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
