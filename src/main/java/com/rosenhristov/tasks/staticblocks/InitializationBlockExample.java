package com.rosenhristov.tasks.staticblocks;

public class InitializationBlockExample {

    public static void main(String[] args) {
        B a = new B();
    }
}

class A {

    protected int a;

    {
        a = 1;
        System.out.printf("A: IIB block: %s\n", a);
    }

    A() {
        System.out.println("A: Constructor");
    }

}


class B extends A {

    int b;
    static int c;

    static {
        c = 3;
        System.out.printf("B: static block: %s\n", c);
    }

    {
        b = 2;
        System.out.printf("B: IIB block: %s:%s:%s\n", a, b, c);
    }

    B() {
        super();
        System.out.println("B: Constructor");
    }
}