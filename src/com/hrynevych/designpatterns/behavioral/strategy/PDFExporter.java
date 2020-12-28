package com.hrynevych.designpatterns.behavioral.strategy;

public class PDFExporter implements Exporter{
    @Override
    public void export() {
        System.out.println("Exporting project to .pdf...");
    }
}
