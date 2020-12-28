package com.hrynevych.designpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class Palette {
    private static final Map<String, Color> colors = new HashMap<>();


    public Color getRgbColorByName(String name){
        Color color = colors.get(name);

        if(color == null){
            color = switch (name) {
                case "white": yield new RgbColor(255, 255, 255);
                case "black": yield new RgbColor(0, 0, 0);
                case "red": yield new RgbColor(255, 0, 0);
                case "green": yield new RgbColor(0, 255, 0);
                case "blue": yield new RgbColor(0, 0, 255);
                case "yellow": yield new RgbColor(0, 255, 255);
                case "pink": yield new RgbColor(255, 0, 255);
                case "orange": yield new RgbColor(255, 102, 0);
                default:
                    throw new IllegalStateException("Unexpected color: " + name);
            };
            colors.put(name, color);
        }


        return color;
    }
}
