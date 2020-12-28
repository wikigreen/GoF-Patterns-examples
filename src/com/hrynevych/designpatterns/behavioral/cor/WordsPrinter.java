package com.hrynevych.designpatterns.behavioral.cor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordsPrinter extends Analyzer {

    public WordsPrinter(Depth depth) {
        super(depth);
    }

    @Override
    public void analyseString(String subject, Depth depth) {
        if(!this.depth.isGreater(depth)){
            Pattern pattern = Pattern.compile("\\b[a-zA-Z]+\\b");
            Matcher matcher = pattern.matcher(subject);

            while(matcher.find()){
                System.out.println("Found word '" + matcher.group() + "'");
            }
        }
        if(next != null){
            next.analyseString(subject, depth);
        }
    }
}
