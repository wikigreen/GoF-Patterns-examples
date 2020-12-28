package com.hrynevych.designpatterns.structural.proxy;

import java.util.Scanner;

public class ProxyFileDownloader implements Downloadable {
    private final Downloadable downloadable;
    private final Scanner scanner = new Scanner(System.in);

    public ProxyFileDownloader(String fileName) {
        this.downloadable = new FileDownloader(fileName);
    }

    @Override
    public void download() {
        System.out.print("Type password to access the file: ");
        if(scanner.nextLine().equals("qwerty123")){
            System.out.println("Access approved!");
            downloadable.download();
        } else {
            System.out.println("Password is incorrect, access denied!");
        }
    }
}
