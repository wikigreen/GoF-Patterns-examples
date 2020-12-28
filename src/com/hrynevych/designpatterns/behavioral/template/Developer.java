package com.hrynevych.designpatterns.behavioral.template;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Developer {
    private String name;
    private int age;
    private final List<String> skills = new ArrayList<>();
    private int experience;
    private boolean haveDegree;

    public Developer(String name, int age, int experience, boolean haveDegree) {
        this.name = name;
        this.age = age;
        this.experience = experience;
        this.haveDegree = haveDegree;
    }

    public void addSkills(String... skills){
        this.skills.addAll(Arrays.asList(skills));
    }

    public void addSkills(List<String> skills){
        this.skills.addAll(skills);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<String> getSkills() {
        return skills;
    }

    public int getExperience() {
        return experience;
    }

    public boolean isHaveDegree() {
        return haveDegree;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setHaveDegree(boolean haveDegree) {
        this.haveDegree = haveDegree;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", skills=" + skills +
                ", experience=" + experience +
                ", haveDegree=" + haveDegree +
                '}';
    }
}
