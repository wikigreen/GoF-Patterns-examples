package com.hrynevych.designpatterns.behavioral.command.commands;

import com.hrynevych.designpatterns.behavioral.command.AudioPlayer;

public class DecreaseVolumeCommand implements Command {
    AudioPlayer audioPlayer;

    public DecreaseVolumeCommand(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    @Override
    public void execute() {
        audioPlayer.decreaseVolume();
    }
}
