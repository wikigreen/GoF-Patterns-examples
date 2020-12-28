package com.hrynevych.designpatterns.behavioral.state.commands;

public class NotSupportedCommand extends Command {
    private String command;
    public NotSupportedCommand(String command) {
        super(null);
        this.command = command;
    }


    @Override
    public void execute() {
        System.out.println("Command " + command + " is not supported");
    }
}
