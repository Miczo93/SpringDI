package com.example.springexample;

public class PrintableFactory {
    public static Printable getPrintable() {
        System.out.println("Printable Factory static");
        return new A();
    }

    public Printable getPrintable2() {
        System.out.println("Printable Factory");
        return new A();
    }


}
