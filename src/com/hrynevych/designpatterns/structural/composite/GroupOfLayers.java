package com.hrynevych.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class GroupOfLayers implements GraphicObject {
    private List<GraphicObject> graphicObjects = new ArrayList<>();

    public void addGraphicObject(GraphicObject graphicObject){
        graphicObjects.add(graphicObject);
    }
    
    public void removeGraphicObject(GraphicObject graphicObject){
        graphicObjects.remove(graphicObject);
    }
    
    
    @Override
    public int getWeight() {
        return graphicObjects.stream()
                .map(GraphicObject::getWeight)
                .reduce(0, Integer::sum);
    }
}
