package com.hrynevych.designpatterns.behavioral.strategy;

public class Editor {
    String projectName;
    Exporter exporter = new PsdExporter();

    public Editor(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public void export(){
        exporter.export();
    }

    public void setExporter(Exporter exporter) {
        this.exporter = exporter;
    }
}
