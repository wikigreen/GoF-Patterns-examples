package com.hrynevych.designpatterns.behavioral.odserver;

import java.util.Arrays;
import java.util.List;

public class YouTubeChannel implements Channel {
    private List<User> users;

    public YouTubeChannel(List<User> users) {
        this.users = users;
    }

    public YouTubeChannel(User... users){
        this.users = Arrays.asList(users);
    }

    @Override
    public void notifyUsers(String videoName) {
        System.out.println("We have new video for you: " + "\"" + videoName + "\"\n");
        users.forEach(u -> u.watchVideo(videoName));
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void removeUser(User user) {
        users.remove(user);
    }
}
