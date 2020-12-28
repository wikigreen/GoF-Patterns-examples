package com.hrynevych.designpatterns.behavioral.visitor;

public class FileFormat implements ProjectElement {

    @Override
    public void set(Designer designer) {
        designer.doJob(this);
    }
}
