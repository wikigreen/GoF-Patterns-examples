package com.hrynevych.designpatterns.behavioral.visitor;

public class ColorSettings implements ProjectElement {
    @Override
    public void set(Designer designer) {
        designer.doJob(this);
    }
}
