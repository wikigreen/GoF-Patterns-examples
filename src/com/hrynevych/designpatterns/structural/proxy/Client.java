package com.hrynevych.designpatterns.structural.proxy;

public class Client {
    public static void main(String[] args) {
        Downloadable downloadable = new ProxyFileDownloader("cat.png");
        downloadable.download();
    }
}
