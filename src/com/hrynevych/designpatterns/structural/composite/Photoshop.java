package com.hrynevych.designpatterns.structural.composite;

public class Photoshop {
    public static void main(String[] args) {
        GroupOfLayers mainGroup = new GroupOfLayers();
        GroupOfLayers nestedGroup = new GroupOfLayers();
        Layer nestedLayer1 = new Layer(100);
        Layer nestedLayer2 = new Layer(200);
        Layer nestedLayer3 = new Layer(700);
        GroupOfLayers nestedNestedGroup = new GroupOfLayers();
        Layer nestedNestedLayer1 = new Layer(500);
        Layer nestedNestedLayer2 = new Layer(700);
        Layer nestedNestedLayer3 = new Layer(800);
        Layer mainLayer1 = new Layer(1000);
        Layer mainLayer2 = new Layer(2000);
        Layer mainLayer3 = new Layer(3000);

        mainGroup.addGraphicObject(mainLayer1);
        mainGroup.addGraphicObject(mainLayer2);
        mainGroup.addGraphicObject(mainLayer3);

        mainGroup.addGraphicObject(nestedGroup);
            nestedGroup.addGraphicObject(nestedLayer1);
            nestedGroup.addGraphicObject(nestedLayer2);
            nestedGroup.addGraphicObject(nestedLayer3);

            nestedGroup.addGraphicObject(nestedNestedGroup);
                nestedNestedGroup.addGraphicObject(nestedNestedLayer1);
                nestedNestedGroup.addGraphicObject(nestedNestedLayer2);
                nestedNestedGroup.addGraphicObject(nestedNestedLayer3);

        System.out.println("Double nested group weight is " + nestedNestedGroup.getWeight() + " kb");
        System.out.println("Nested group weight is " + nestedGroup.getWeight() + " kb");
        System.out.println("Main group weight is " + mainGroup.getWeight() + " kb");



    }
}
