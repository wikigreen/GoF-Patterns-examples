package com.hrynevych.designpatterns.behavioral.command.commands;

import com.hrynevych.designpatterns.behavioral.command.AudioPlayer;

public class PlayPreviousCommand implements Command {
    AudioPlayer audioPlayer;

    public PlayPreviousCommand(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    @Override
    public void execute() {
        audioPlayer.playPrevious();
    }
}
