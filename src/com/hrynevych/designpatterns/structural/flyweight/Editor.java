package com.hrynevych.designpatterns.structural.flyweight;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Editor {
    public static void main(String[] args) {
        Palette palette = new Palette();
        List<Shape> shapes = Stream.of(
        new Shape("Triangle", palette.getRgbColorByName("black")),
        new Shape("Square", palette.getRgbColorByName("white")),
        new Shape("Triangle1", palette.getRgbColorByName("red")),
        new Shape("Square2", palette.getRgbColorByName("green")),
        new Shape("Triangle2", palette.getRgbColorByName("blue")),
        new Shape("Square3", palette.getRgbColorByName("yellow")),
        new Shape("Triangle3", palette.getRgbColorByName("pink")),
        new Shape("Square4", palette.getRgbColorByName("orange")),
        new Shape("Triangle4", palette.getRgbColorByName("black")),
        new Shape("Square5", palette.getRgbColorByName("black")),
        new Shape("Triangle5", palette.getRgbColorByName("white")),
        new Shape("Square6", palette.getRgbColorByName("white")),
        new Shape("Triangle6", palette.getRgbColorByName("white"))
        ).collect(Collectors.toList());

        System.out.println("List of white shapes: ");
        shapes.stream()
                .filter(shape -> palette.getRgbColorByName("white") == shape.getColor()) // checking using '=='
                .forEach(System.out::println);

    }
}
