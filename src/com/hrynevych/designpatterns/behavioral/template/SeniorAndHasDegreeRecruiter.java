package com.hrynevych.designpatterns.behavioral.template;

public class SeniorAndHasDegreeRecruiter extends Recruiter {
    public SeniorAndHasDegreeRecruiter(String name) {
        super(name);
    }

    @Override
    public boolean doesMatches(Developer developer) {
        return developer.getExperience() >= 60
                && developer.isHaveDegree();
    }
}
