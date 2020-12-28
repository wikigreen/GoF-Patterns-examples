package com.hrynevych.designpatterns.structural.bridge;

public class Pixel implements UnitOfLength {

    @Override
    public String getUnitName() {
        return "Current unit of length is pixel";
    }
}
