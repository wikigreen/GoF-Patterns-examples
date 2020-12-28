package com.hrynevych.designpatterns.behavioral.visitor;

public class BadDesigner implements Designer {
    @Override
    public void doJob(Edges edges) {
        System.out.println("Edges? What is it?");
    }

    @Override
    public void doJob(ColorSettings colorSettings) {
        System.out.println("RGB or CMYK ..? I think i should keep default setting and set RGB");
    }

    @Override
    public void doJob(FileFormat fileFormat) {
        System.out.println("I think .jpeg is fine");
    }
}
