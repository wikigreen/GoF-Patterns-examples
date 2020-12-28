package com.hrynevych.designpatterns.creational.prototype;

public class PetriDish {
    public static void main(String[] args) {
        Cell parent = new Cell("Ciliate", 10);
        System.out.println(parent);

        Cell child = (Cell) parent.clone();
        System.out.println(child);
        System.out.println();

        if(parent == child)
            System.out.println("Parent and child are same objects");
        else
            System.out.println("Parent and child are not same objects");

        if(parent.equals(child))
            System.out.println("Parent is equal to child");
        else
            System.out.println("Parent is not equal to child");

    }
}
