package com.hrynevych.designpatterns.behavioral.command;

public class AudioPlayer {
    public void increaseVolume(){
        System.out.println("The music became louder");
    }

    public void decreaseVolume() {
        System.out.println("The music became quieter");
    }

    public void playTrack() {
        System.out.println("Playing track...");
    }

    public void pauseTrack() {
        System.out.println("Track is paused...");
    }

    public void playNext() {
        System.out.println("Playing next track...");
    }

    public void playPrevious() {
        System.out.println("Playing previous song...");
    }

    public void stop(){
        System.out.println("Player has been stopped");
    }




}
