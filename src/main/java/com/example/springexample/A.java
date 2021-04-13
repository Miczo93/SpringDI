package com.example.springexample;

public class A implements Printable {

    private static final A obj = new A();

    B b;

    A() {
        System.out.println("a is created");
    }

    A(B b) {
        this.b = b;
        System.out.println("a is created and b is set up");
    }

    public static A getA() {
        System.out.println("factory method");
        return new A();
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

    @Override
    public void print() {
        System.out.println("hello a");
    }

    void display() {
        print();
        try {
            b.print();
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }
}
