package com.hrynevych.designpatterns.structural.decorator;

public class Project{
    String name;
    int width;
    int height;
    ColorModel colorModel;

    public Project(String name, int width, int height, ColorModel colorModel) {
        this.name = name;
        this.width = width;
        this.height = height;
        this.colorModel = colorModel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public ColorModel getColorModel() {
        return colorModel;
    }

    public void setColorModel(ColorModel colorModel) {
        this.colorModel = colorModel;
    }

    public String toString(){
        return "Project '" + name + "', size: " + width + "x" + height + ", color model:" + colorModel.toString();
    }
}

    enum ColorModel{
    CMYK("CMYK"), RGB("RGB");

    private final String colorModel;

    ColorModel(String colorModel) {
        this.colorModel = colorModel;
    }

    public String toString(){
        return colorModel;
    }
}