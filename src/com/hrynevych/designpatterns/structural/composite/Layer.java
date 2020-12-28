package com.hrynevych.designpatterns.structural.composite;

public class Layer implements GraphicObject{
    private int weight;

    public Layer(int weight) {
        this.weight = weight;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
