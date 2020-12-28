package com.hrynevych.designpatterns.structural.bridge;

public class Project {
    private UnitOfLength unitOfLength;
    private Color color;
    private SaveSettings saveSettings;

    public void projectSettings(){
        System.out.println(unitOfLength.getUnitName());
        System.out.println(color.getModelName());
        saveSettings.save();
        System.out.println();
    }

    public Project(UnitOfLength unitOfLength, Color color, SaveSettings saveSettings) {
        this.unitOfLength = unitOfLength;
        this.color = color;
        this.saveSettings = saveSettings;
    }

    public UnitOfLength getUnitOfLength() {
        return unitOfLength;
    }

    public void setUnitOfLength(UnitOfLength unitOfLength) {
        this.unitOfLength = unitOfLength;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public SaveSettings getSaveSettings() {
        return saveSettings;
    }

    public void setSaveSettings(SaveSettings saveSettings) {
        this.saveSettings = saveSettings;
    }
}
