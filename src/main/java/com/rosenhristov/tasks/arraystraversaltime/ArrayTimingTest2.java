package com.rosenhristov.tasks.arraystraversaltime;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ArrayTimingTest2 {

    private static final int SIZE = 1000000;
    private Integer[] ordered;
    private Integer[] shuffled;

    public static void main(String[] args) {
        new ArrayTimingTest2().go();
    }

    private void go() {
        setup();
        System.out.println("Ordered: ");
        time(ordered);
        System.out.println("Shuffled: ");
        time(shuffled);
        System.out.println("Ordered: ");
        time(ordered);
        System.out.println("Shuffled: ");
        time(shuffled);
    }

    private void setup() {
        ordered = new Integer[SIZE];
        shuffled = new Integer[SIZE];
        Random random = new Random();
        for (int i = 0; i < ordered.length; i++) {
            ordered[i] = i;
            shuffled[i] = random.nextInt();
        }
        shuffled = new Integer[SIZE];
        System.arraycopy(ordered, 0, shuffled, 0, SIZE);
        List<Integer> list = Arrays.asList(shuffled);
        Collections.shuffle(list);
        shuffled = list.toArray(shuffled);
    }

    private void time(Integer[] indexes) {
        long now = System.currentTimeMillis();
        Integer sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += sum(indexes);
        }
        long elapsed = System.currentTimeMillis() - now;
        System.out.println("Sum = " + sum + " in " + elapsed + " milliseconds");
    }

    private int sum(Integer[] indexes) {
        int sum = 0;
        for (int i : indexes) {
            sum += i;
        }
        return sum;
    }
}
