package com.hrynevych.designpatterns.structural.facade;

public class Customer {
    public static void main(String[] args) {
        Manager manager = new Manager();

        manager.makeOrder();
    }
}
