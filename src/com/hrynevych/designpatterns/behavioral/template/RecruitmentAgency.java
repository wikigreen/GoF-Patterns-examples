package com.hrynevych.designpatterns.behavioral.template;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RecruitmentAgency {
    public static void main(String[] args) {
        Developer developer1 = new Developer("Vladimir", 19, 0, false);
        developer1.addSkills("Java", "Java Core");
        Developer developer2 = new Developer("Elena", 25, 6, true);
        developer2.addSkills("Java", "Java Core", "Spring Core", "SQL", "Maven");
        Developer developer3 = new Developer("Andrey", 45, 73, true);
        developer3.addSkills("Java", "Java Core", "Spring Core", "SQL", "Maven", "NoSQL",
                "REST", "Docker");
        Developer developer4 = new Developer("Bohdan", 32, 15, false);
        developer4.addSkills("JavaScript", "HTML", "CSS", "Angular");
        Developer developer5 = new Developer("Eugene", 38, 72, true);
        developer5.addSkills("Swift", "UIKit", "Cocoapods", "Rest API", "Core Data", "Realm", "Core Animation", "MVVM");
        Developer developer6 = new Developer("Katia", 27, 5, false);
        developer6.addSkills("Java", "Selenium", "Selenide", "SQL", "TestNG", "JUnit");

        List<Developer> developers = Stream.of(developer1, developer2, developer3, developer4, developer5, developer6).collect(Collectors.toList());

        JavaBackEndRecruiter javaBackEndRecruiter = new JavaBackEndRecruiter("\"java back-end\"");
        developers.forEach(javaBackEndRecruiter::checkDeveloper);
        javaBackEndRecruiter.showAllDevelopers();

        System.out.println("====================================================================");

        SeniorAndHasDegreeRecruiter seniorAndHasDegreeRecruiter =
                new SeniorAndHasDegreeRecruiter("Senior with degree");
        developers.forEach(seniorAndHasDegreeRecruiter::checkDeveloper);
        seniorAndHasDegreeRecruiter.showAllDevelopers();

        System.out.println("====================================================================");

        InternRecruiter internRecruiter = new InternRecruiter("\"interns\"");
        developers.forEach(internRecruiter::checkDeveloper);
        internRecruiter.showAllDevelopers();
    }
}
