package com.hrynevych.designpatterns.behavioral.command.commands;

import com.hrynevych.designpatterns.behavioral.command.AudioPlayer;

public class IncreaseVolumeCommand implements Command{
    AudioPlayer audioPlayer;

    public IncreaseVolumeCommand(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    @Override
    public void execute() {
        audioPlayer.increaseVolume();
    }
}
