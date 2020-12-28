package com.hrynevych.designpatterns.behavioral.iterator;

public interface Iterable {
    Iterator getIterator(Access access);
}
