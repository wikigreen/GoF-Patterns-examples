package com.hrynevych.designpatterns.structural.decorator;

public class Designer {
    public static void main(String[] args) {
        GraphicsEditor paint = new BasicEditor();
        paint.createProject("photo", 1280, 720);
        System.out.println(paint.getCurrentProject().toString());
        paint.drawShape();
        paint.saveProject();
        System.out.println();

        GraphicsEditor adobeIllustrator = new CMYKEditor(new PDFSaver(new VectorEditor(new BasicEditor())));
        adobeIllustrator.createProject("business card", 90, 50);
        System.out.println(adobeIllustrator.getCurrentProject());
        adobeIllustrator.drawShape();
        adobeIllustrator.saveProject();
        System.out.println();

        GraphicsEditor figma = new PDFSaver(new VectorEditor(new BasicEditor()));
        figma.createProject("landing page", 960, 5000);
        System.out.println(figma.getCurrentProject());
        figma.drawShape();
        figma.saveProject();
        figma.getCurrentProject();

    }
}
