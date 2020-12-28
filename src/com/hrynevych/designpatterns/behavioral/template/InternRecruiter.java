package com.hrynevych.designpatterns.behavioral.template;

public class InternRecruiter extends Recruiter {
    public InternRecruiter(String name) {
        super(name);
    }

    @Override
    public boolean doesMatches(Developer developer) {
        return developer.getAge() <= 25
                && developer.getExperience() == 0;
    }
}
