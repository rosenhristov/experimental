package com.rosenhristov.tasks.staticblocks;

public class StaticExample {

    public static void main(String[] args) {
        StaticClass staticClass = new StaticClass();
        AnonymousBlockExample anonymous = new AnonymousBlockExample();
        anonymous.printIt();
    }

}

class StaticClass {
    static int x;
    static int y;

    public StaticClass() {
        System.out.println("StaticClass: constructor");
    }

    static {
        x = 1;
        y = 2;
        System.out.printf("StaticClass:static block: {%s;%s}\n", x, y);
    }
}
