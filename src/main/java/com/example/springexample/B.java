package com.example.springexample;

public class B implements Printable {
    B() {
        System.out.println("b is created");
    }

    @Override
    public void print() {
        System.out.println("hello b");
    }
}
