package com.hrynevych.designpatterns.behavioral.visitor;

public class Polygraphy {
    public static void main(String[] args) {
        Designer badDesigner = new BadDesigner();

        badDesigner.doJob(new Edges());
        badDesigner.doJob(new ColorSettings());
        badDesigner.doJob(new FileFormat());

        System.out.println("====================================");

        Designer goodDesigner = new GoodDesigner();

        goodDesigner.doJob(new Edges());
        goodDesigner.doJob(new ColorSettings());
        goodDesigner.doJob(new FileFormat());
    }
}
