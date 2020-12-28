package com.hrynevych.designpatterns.structural.decorator;

public interface GraphicsEditor {
    void createProject(String name, int width, int height);
    void drawShape();
    void saveProject();
    Project getCurrentProject();
}
