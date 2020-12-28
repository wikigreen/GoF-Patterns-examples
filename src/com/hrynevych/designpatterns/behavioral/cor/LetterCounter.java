package com.hrynevych.designpatterns.behavioral.cor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LetterCounter extends Analyzer {
    public LetterCounter(Depth depth) {
        super(depth);
    }

    @Override
    public void analyseString(String subject, Depth depth) {
//        System.out.println(this.depth.getPriority());
//        System.out.println(depth.getPriority());
//        System.out.println(this.depth.isGreater(depth));
        if(!this.depth.isGreater(depth)){
            Pattern pattern = Pattern.compile("[a-zA-Z]");
            Matcher matcher = pattern.matcher(subject);

            int counter = 0;
            while(matcher.find()){
                counter++;
            }
            System.out.println("Found " + counter + " letter(s)");
        }
        if(next != null){
            next.analyseString(subject, depth);
        }

    }
}
