package com.hrynevych.designpatterns.behavioral.odserver;

public interface Channel {
    void notifyUsers(String videoName);
    void addUser(User user);
    void removeUser(User user);
}
