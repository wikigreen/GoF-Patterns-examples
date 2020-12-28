package com.hrynevych.designpatterns.behavioral.command.commands;

import com.hrynevych.designpatterns.behavioral.command.AudioPlayer;

public class HelpCommand implements Command {
    @Override
    public void execute() {
        System.out.println("List of all commands: increase, decrease, play, play next, pause, stop");
    }

}
