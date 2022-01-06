package com.sid.tutorials.spring.module05.ds;

public class MutableCountHolder {
    private int count;

    public int get() {
        return count;
    }

    public int increment() {
        return ++count;
    }
}
