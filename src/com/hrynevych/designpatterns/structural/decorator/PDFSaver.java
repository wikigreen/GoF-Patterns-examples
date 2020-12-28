package com.hrynevych.designpatterns.structural.decorator;

public class PDFSaver implements GraphicsEditor{
    GraphicsEditor wrapped;

    public PDFSaver (GraphicsEditor graphicsEditor){
        this.wrapped = graphicsEditor;
    }

    @Override
    public void createProject(String name, int width, int height) {
        wrapped.createProject(name, width, height);
    }

    @Override
    public void drawShape() {
        wrapped.drawShape();
    }

    @Override
    public void saveProject() {
        if(wrapped.getCurrentProject() == null)
            System.out.println("No projects opened");
        else{
            System.out.println("Saving .pdf file...");
        }
    }

    @Override
    public Project getCurrentProject() {
        return wrapped.getCurrentProject();
    }
}
