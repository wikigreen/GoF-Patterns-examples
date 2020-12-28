package com.hrynevych.designpatterns.structural.proxy;

public class FileDownloader implements Downloadable {
    String fileName;

    public FileDownloader(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void download() {
        System.out.println("Starting downloading file '" + fileName + "'");
        for(int i = 0; i < 101; i += 10){
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i +"%...");
        }
        System.out.println("File has been downloaded");
    }
}
