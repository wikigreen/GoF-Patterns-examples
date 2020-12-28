package com.hrynevych.designpatterns.behavioral.mediator;

public enum Network {
    LIFECELL("63"), VODAFONE("99"), KIEVSTAR("67");
    private final String code;

    Network(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
