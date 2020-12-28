package com.hrynevych.designpatterns.behavioral.interpreter;

public enum NumeralSystems {
    BINARY(2),
    TERTIARY(3),
    QUATERNARY(4),
    QUINARY(5),
    SENARY(6),
    SEPTENARY(7),
    OCTAL(8),
    NONARY(9);

    private final int odd;

    NumeralSystems(int odd) {
        this.odd = odd;
    }

    public int getOdd() {
        return odd;
    }
}
