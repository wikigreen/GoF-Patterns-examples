package com.hrynevych.designpatterns.behavioral.odserver;

public class YouTube {
    public static void main(String[] args) {
        User user1 = new YouTubeUser("wiki green");
        User user2 = new YouTubeUser("Simple");
        User user3 = new YouTubeUser("Alexey Samsonov");

        Channel youTubeChannel = new YouTubeChannel(user1, user2, user3);

        youTubeChannel.notifyUsers("Шаблоны Java. Observer (Наблюдатель)");
    }
}
