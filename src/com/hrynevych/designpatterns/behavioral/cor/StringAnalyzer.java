package com.hrynevych.designpatterns.behavioral.cor;

public class StringAnalyzer {
    public static void main(String[] args) {
        LetterCounter letterAnalyzer = new LetterCounter(Depth.BASIC);
        WordsCounter wordsCounter = new WordsCounter(Depth.ESSENTIAL);
        WordsPrinter wordsPrinter = new WordsPrinter(Depth.ADVANCED);

        letterAnalyzer.setAnalyzer(wordsCounter).setAnalyzer(wordsPrinter);

        letterAnalyzer.analyseString("dog dog d0g dog", Depth.ADVANCED);
        System.out.println();
        letterAnalyzer.analyseString("a1b2c3d4 hello", Depth.ESSENTIAL);
        System.out.println();
        letterAnalyzer.analyseString("adcdef123jh", Depth.BASIC);

    }
}
