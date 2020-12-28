package com.hrynevych.designpatterns.structural.facade;

public class Manager {
    Designer designer = new Designer();
    CtpOperator ctpOperator = new CtpOperator();
    Printer printer = new Printer();
    Packer packer = new Packer();
    Delivery delivery = new Delivery();

    public void makeOrder() {
        designer.makeLayout();
        ctpOperator.makeOffsetPlates();
        printer.print();
        packer.pack();
        delivery.deliverOrder();
    }
}
