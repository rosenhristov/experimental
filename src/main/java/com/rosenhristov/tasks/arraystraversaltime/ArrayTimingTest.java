package com.rosenhristov.tasks.arraystraversaltime;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ArrayTimingTest {

    private static final int SIZE = 1000000;

    private Integer[] ordered;
    private Integer[] shuffled;
    private double[] data;

    public static void main(String[] args) {
        new ArrayTimingTest().go();
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
        data = new double[SIZE];
        Random random = new Random();
        for (int i = 0; i < ordered.length; i++) {
            ordered[i] = i;
            data[i] = random.nextDouble();
        }
        shuffled = new Integer[SIZE];
        System.arraycopy(ordered, 0, shuffled, 0, SIZE);
        List<Integer> list = Arrays.asList(shuffled);
        Collections.shuffle(list);
        shuffled = list.toArray(shuffled);
    }

    private void time(Integer[] indexes) {
        long now = System.currentTimeMillis();
        double sum = 0.0;
        for (int i = 0; i < 10; i++) {
            sum += sum(indexes);
        }
        long elapsed = System.currentTimeMillis() - now;
        System.out.println("Sum = " + sum + " in " + elapsed + " milliseconds");
    }

    private double sum(Integer[] indexes) {
        double sum = 0.0;
        for (Integer i : indexes) {
            sum += data[i];
        }
        return sum;
    }
}
