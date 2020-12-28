package com.hrynevych.designpatterns.behavioral.visitor;

public interface Designer {
    void doJob(Edges edges);
    void doJob(ColorSettings colorSettings);
    void doJob(FileFormat fileFormat);
}
