package com.hrynevych.designpatterns.behavioral.template;

import java.util.ArrayList;
import java.util.List;

public abstract class Recruiter {
    private final List<Developer> developers = new ArrayList<>();
    private String name;

    public Recruiter(String name) {
        this.name = name;
    }

    public boolean checkDeveloper(Developer developer){
        if(doesMatches(developer)){
            return developers.add(developer);
        }
        return false;
    }

    public void showAllDevelopers(){
        System.out.println("Recruiter " + name + " found " + developers.size() + " suitable developer(s): ");
        developers.forEach(System.out::println);
    }

    public abstract boolean doesMatches(Developer developer);


}
