package com.hrynevych.designpatterns.structural.bridge;

public class PDFSave implements SaveSettings {
    @Override
    public void save() {
        System.out.println("Saving to .pdf file");
    }
}
