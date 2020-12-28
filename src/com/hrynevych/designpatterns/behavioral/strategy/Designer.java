package com.hrynevych.designpatterns.behavioral.strategy;

public class Designer {
    public static void main(String[] args) {
        Editor editor = new Editor("business card");

        editor.setExporter(new JpegExporter());
        editor.export();

        editor.setExporter(new PDFExporter());
        editor.export();

        editor.setExporter(new PsdExporter());
        editor.export();
    }
}
