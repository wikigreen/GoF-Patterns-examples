package com.hrynevych.designpatterns.behavioral.command;

import com.hrynevych.designpatterns.behavioral.command.commands.*;

import java.util.Scanner;

public class Listener {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        Scanner scanner = new Scanner(System.in);
        Command command;
        do {
            System.out.print("Type command:");
            command = getCommand(scanner.nextLine().trim(), audioPlayer);
            command.execute();
        } while (!(command instanceof StopCommand));
    }

    public static Command getCommand(String command, AudioPlayer audioPlayer){
        return switch (command){
            case "increase" : yield new IncreaseVolumeCommand(audioPlayer);
            case "decrease" : yield new DecreaseVolumeCommand(audioPlayer);
            case "play" : yield new PlayTrackCommand(audioPlayer);
            case "play next" : yield new PlayNextCommand(audioPlayer);
            case "play prev" : yield new PlayPreviousCommand(audioPlayer);
            case "pause" : yield new PauseTrackCommand(audioPlayer);
            case "stop" : yield new StopCommand(audioPlayer);
            case "help" : yield new HelpCommand();
            default: yield new UnknownCommand(command);
        };
    }

}
