package com.hrynevych.designpatterns.behavioral.cor;

public abstract class Analyzer {
    protected Depth depth;
    protected Analyzer next;

    public Analyzer(Depth depth) {
        this.depth = depth;
    }

    public Analyzer setAnalyzer(Analyzer next){
        this.next = next;
        return this.next;
    }

    public abstract void analyseString(String subject, Depth depth);


}
