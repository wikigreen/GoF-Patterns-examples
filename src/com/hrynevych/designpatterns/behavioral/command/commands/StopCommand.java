package com.hrynevych.designpatterns.behavioral.command.commands;

import com.hrynevych.designpatterns.behavioral.command.AudioPlayer;

public class StopCommand implements Command {
    AudioPlayer audioPlayer;

    public StopCommand(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    @Override
    public void execute() {
        audioPlayer.stop();
    }
}
