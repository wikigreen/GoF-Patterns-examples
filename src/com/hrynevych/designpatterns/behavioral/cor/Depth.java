package com.hrynevych.designpatterns.behavioral.cor;

public enum Depth {
    BASIC(0), ESSENTIAL(1), ADVANCED(2);

    private int depth;

    Depth(int priority){
        this.depth = priority;
    }

    public int getDepth() {
        return depth;
    }

    public boolean isGreater(Depth depth){
        return this.depth > depth.depth;
    }
}
