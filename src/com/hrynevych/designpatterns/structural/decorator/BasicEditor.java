package com.hrynevych.designpatterns.structural.decorator;

public class BasicEditor implements GraphicsEditor{
    private Project currentProject;

    @Override
    public void createProject(String name, int width, int height) {
        this.currentProject = new Project(name, width, height, ColorModel.RGB);
        System.out.println(currentProject.name + " has been created");
    }

    @Override
    public void drawShape() {
        if(currentProject != null)
            System.out.println("Drawing shape...");
        else
            System.out.println("No projects opened");
    }

    @Override
    public void saveProject() {
        if(currentProject != null)
            System.out.println("Saving .png file...");
        else
            System.out.println("No projects opened");
    }

    public Project getCurrentProject() {
        return currentProject;
    }

    public void setCurrentProject(Project currentProject) {
        this.currentProject = currentProject;
    }

    public String toString(){
        return "Editor has next opened projects: " + (currentProject == null ? "No projects opened" : currentProject.getName());
    }


}
