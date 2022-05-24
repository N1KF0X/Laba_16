package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("a = ");
        int a = in.nextInt();

        System.out.print("b = ");
        int b = in.nextInt();

        System.out.print("c = ");
        int c = in.nextInt();

        SomeKindClass someThing = new SomeKindClass(a, b, c);

        Converter<SomeKindClass, SomeKindClass1> converter;
        converter = (t) -> new SomeKindClass1(t.a, t.b, t.c);

        SomeKindClass1 someThing1 = converter.convert(someThing);
        System.out.printf("%d, %d, %d",someThing1.a, someThing1.b, someThing1.c);

        System.out.println();

        someThing1.b = 5;

        Converter<SomeKindClass1, SomeKindClass> converter1;
        converter1 = (t) -> new SomeKindClass(t.a, t.b, t.c);

        someThing = converter1.convert(someThing1);
        System.out.printf("%d, %d, %d",someThing.a, someThing.b, someThing1.c);
    }
}
