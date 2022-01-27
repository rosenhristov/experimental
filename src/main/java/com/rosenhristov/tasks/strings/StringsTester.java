package com.rosenhristov.tasks.strings;

public class StringsTester {

    public static void main(String[] args) {
        String hello = "Hello";
        String hello2 = "Hello";
        String atHello = hello;
        String internedHello = "Hello".intern();
        String newHello = new String("Hello");
        String hel = "Hel";
        String lo = "lo";
        String hellAndLo = hel + lo;


        System.out.printf("hello == hello2: %s\n", hello == hello2); //true
        System.out.printf("hello == atHello: %s\n", hello == atHello); //true
        System.out.printf("hello == internedHello: %s\n", hello == internedHello); //true
        System.out.printf("hello == hellAndLo.intern(): %s\n", hello == hellAndLo.intern()); //true
        System.out.printf("hello == newHello: %s\n", hello == newHello); //false
        System.out.printf("hello == hellAndLo: %s\n", hello == hellAndLo); //false
    }
}
