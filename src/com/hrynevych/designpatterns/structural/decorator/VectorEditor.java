package com.hrynevych.designpatterns.structural.decorator;

public class VectorEditor implements GraphicsEditor{
    private GraphicsEditor wrapped;

    public VectorEditor(GraphicsEditor wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public void createProject(String name, int width, int height) {
        wrapped.createProject(name, width, height);
    }

    @Override
    public void drawShape() {
        System.out.println("Drawing vector shape...");
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
