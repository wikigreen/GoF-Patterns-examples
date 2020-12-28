package com.hrynevych.designpatterns.behavioral.mediator;

public enum Country {
    UKRAINE("+380"), RUSSIAN_FEDERATION("+7");
    private final String code;

    Country(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
