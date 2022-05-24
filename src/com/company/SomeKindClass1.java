package com.company;

public class SomeKindClass1 {
    double a, b, c;

    public SomeKindClass1(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    void Count(double a, double b, double c){
        System.out.println(a * Math.pow(b, c));
    }
}
