package com.hrynevych.designpatterns.behavioral.visitor;

public class Edges implements ProjectElement {
    @Override
    public void set(Designer designer) {
        designer.doJob(this);
    }
}
