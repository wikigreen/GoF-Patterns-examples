package com.hrynevych.designpatterns.structural.adapter;

public class Run {
    public static void main(String[] args) {
        Frontend frontend = new AdapterConsoleToFrontend();
        frontend.createButton();
        frontend.readButton();
        frontend.updateButton();
        frontend.deleteButton();
    }
}
