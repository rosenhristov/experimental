package com.rosenhristov.tasks.staticblocks;

public class Blocks {

    int x;
    long y;
    final int f;

    {
//        this.f = 25;
        System.out.println("initialization");
    }

    public Blocks() {
        this(0, 0L);
    }

    public Blocks(int x) {
        this(x, 0L);
    }

    public Blocks(long y) {
        this(0, y);
    }

    public Blocks(int x, long y) {
        this.x = x;
        this.y = y;
        this.f = 25;
    }

    public static void main(String[] args) {
        Blocks blocks = new Blocks();
        System.out.printf(" x: %s & y: %s, z: %s\n", blocks.x, blocks.y, blocks.f);
        Blocks blocks1 = new Blocks(5);
        System.out.printf(" x: %s & y: %s, z: %s\n", blocks1.x, blocks1.y, blocks.f);
        Blocks blocks2 = new Blocks(5L);
        System.out.printf(" x: %s & y: %s, z: %s\n", blocks2.x, blocks2.y, blocks.f);
        Blocks blocks3 = new Blocks(4, 5L);
        System.out.printf(" x: %s & y: %s, z: %s\n", blocks3.x, blocks3.y, blocks.f);
        System.out.printf("blocks: hashCode@toString(): %s@%s\n",
                blocks.hashCode(),
                blocks.toString().substring(blocks.toString().indexOf("@") + 1));
    }
}
