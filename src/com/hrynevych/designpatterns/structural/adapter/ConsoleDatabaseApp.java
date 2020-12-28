package com.hrynevych.designpatterns.structural.adapter;

public class ConsoleDatabaseApp {

    public void createConsoleCommand(){
        System.out.println("Object is created");
    }

    public void readConsoleCommand(){
        System.out.println("Object is read");
    }

    public void updateConsoleCommand(){
        System.out.println("Object is updated");
    }

    public void deleteConsoleCommand(){
        System.out.println("Object is deleted");
    }


}
