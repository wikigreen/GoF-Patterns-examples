package com.hrynevych.designpatterns.behavioral.strategy;

public class JpegExporter implements Exporter {
    @Override
    public void export() {
        System.out.println("Exporting project to .jpeg...");
    }
}
