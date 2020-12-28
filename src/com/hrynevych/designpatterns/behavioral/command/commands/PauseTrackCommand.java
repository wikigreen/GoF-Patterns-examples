package com.hrynevych.designpatterns.behavioral.command.commands;

import com.hrynevych.designpatterns.behavioral.command.AudioPlayer;

public class PauseTrackCommand implements Command {
    AudioPlayer audioPlayer;

    public PauseTrackCommand(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    @Override
    public void execute() {
        audioPlayer.pauseTrack();
    }
}
