package com.hrynevych.designpatterns.behavioral.template;

public class JavaBackEndRecruiter extends Recruiter{
    public JavaBackEndRecruiter(String name) {
        super(name);
    }

    @Override
    public boolean doesMatches(Developer developer) {
        return developer.getSkills().contains("Java")
                && (developer.getSkills().contains("Spring") || developer.getSkills().contains("Spring Core"))
                && (developer.getSkills().contains("SQL") || developer.getSkills().contains("NoSQL"));
    }
}
