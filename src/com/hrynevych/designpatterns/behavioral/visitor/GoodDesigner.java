package com.hrynevych.designpatterns.behavioral.visitor;

public class GoodDesigner implements Designer {
    @Override
    public void doJob(Edges edges) {
        System.out.println("Setting 5 mm paper cut edges");
    }

    @Override
    public void doJob(ColorSettings colorSettings) {
        System.out.println("Setting CMYK color model");
    }

    @Override
    public void doJob(FileFormat fileFormat) {
        System.out.println("Saving project to .pdf");
    }
}
