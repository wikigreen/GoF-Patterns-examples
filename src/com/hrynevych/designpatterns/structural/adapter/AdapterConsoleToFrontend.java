package com.hrynevych.designpatterns.structural.adapter;

public class AdapterConsoleToFrontend extends ConsoleDatabaseApp implements Frontend{
    @Override
    public void createButton() {
        createConsoleCommand();
    }

    @Override
    public void readButton() {
        readConsoleCommand();
    }

    @Override
    public void updateButton() {
        updateConsoleCommand();
    }

    @Override
    public void deleteButton() {
        deleteConsoleCommand();
    }
}
