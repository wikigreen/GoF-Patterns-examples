package com.hrynevych.designpatterns.structural.bridge;

public class GraphicEditor {
    public static void main(String[] args) {
        Project project = new Project(new Pixel(), new CMYK(), new JpegSave());
        project.projectSettings();
        project.setUnitOfLength(new Millimetre());
        project.projectSettings();
        project.setColor(new RGB());
        project.projectSettings();
        project.setSaveSettings(new PDFSave());
        project.projectSettings();
    }
}
