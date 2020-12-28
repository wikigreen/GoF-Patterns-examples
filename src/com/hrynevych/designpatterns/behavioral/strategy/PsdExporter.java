package com.hrynevych.designpatterns.behavioral.strategy;

public class PsdExporter implements Exporter {
    @Override
    public void export() {
        System.out.println("Exporting project to .psd...");
    }
}
