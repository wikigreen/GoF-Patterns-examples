package com.hrynevych.designpatterns.behavioral.odserver;

public class YouTubeUser implements User {
    private String name;

    public YouTubeUser(String name) {
        this.name = name;
    }

    @Override
    public void watchVideo(String title) {
        System.out.println("User " + this.name + " is watching video " + title);
    }
}
