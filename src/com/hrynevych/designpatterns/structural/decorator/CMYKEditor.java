package com.hrynevych.designpatterns.structural.decorator;

public class CMYKEditor implements GraphicsEditor{
    private final GraphicsEditor wrapped;

    public CMYKEditor(GraphicsEditor wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public void createProject(String name, int width, int height) {
        wrapped.createProject(name, width, height);
        wrapped.getCurrentProject().setColorModel(ColorModel.CMYK);
    }

    @Override
    public void drawShape() {
        wrapped.drawShape();
    }

    @Override
    public void saveProject() {
        wrapped.saveProject();
    }

    @Override
    public Project getCurrentProject() {
        return wrapped.getCurrentProject();
    }
}
