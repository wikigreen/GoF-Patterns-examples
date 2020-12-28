package com.hrynevych.designpatterns.behavioral.cor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordsCounter extends Analyzer {
    public WordsCounter(Depth depth) {
        super(depth);
    }

    @Override
    public void analyseString(String subject, Depth depth) {
        if(!this.depth.isGreater(depth)){
            Pattern pattern = Pattern.compile("\\b[a-zA-Z]+\\b");
            Matcher matcher = pattern.matcher(subject);

            int counter = 0;
            while(matcher.find()){
                counter++;
            }
            System.out.println("Found " + counter + " word(s)");
        }
        if(next != null){
            next.analyseString(subject, depth);
        }
    }
}
