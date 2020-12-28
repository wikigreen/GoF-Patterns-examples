package com.hrynevych.designpatterns.behavioral.command.commands;

public class UnknownCommand implements Command{
    private String command;

    public UnknownCommand(String command){
        this.command = command;
    }

    @Override
    public void execute() {
        System.out.println(command + " is unknown command");
    }
}
