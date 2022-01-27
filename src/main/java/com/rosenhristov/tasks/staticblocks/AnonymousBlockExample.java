package com.rosenhristov.tasks.staticblocks;

public class AnonymousBlockExample {

    int x;
    static int y;

    {
        x = 1;
        System.out.printf("AnonymousBlockExample: Initializer block: {x = %s}\n", x);
    }

    {
        y = 2;
        System.out.printf("AnonymousBlockExample: static  block: {y = %s}\n", y);
    }

    public AnonymousBlockExample() {
        System.out.println("AnonymousBlockExample: Constructor");
    }

    public void printIt() {
        System.out.printf("AnonymousBlockExample: {x: %s, y: %s}\n", x, y);
    }

}
