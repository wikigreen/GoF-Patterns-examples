package com.hrynevych.designpatterns.structural.bridge;

public class CMYK implements Color{
    @Override
    public String getModelName() {
        return "This is CMYK model";
    }
}
