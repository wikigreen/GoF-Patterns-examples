package com.hrynevych.designpatterns.structural.bridge;

public class JpegSave implements SaveSettings {
    @Override
    public void save() {
        System.out.println("Saving to .jpeg file");
    }
}
