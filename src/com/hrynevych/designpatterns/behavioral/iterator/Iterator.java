package com.hrynevych.designpatterns.behavioral.iterator;

public interface Iterator<T> {
    T next();
    boolean hasNext();
}
