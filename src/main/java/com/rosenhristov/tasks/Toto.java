package com.rosenhristov.tasks;

import java.util.*;
import java.util.stream.Collectors;

public class Toto
{
    public static void main(String[] args) {
        List<Integer> toto = initialize();
        for (int i = 1; i <= 3; i++) {
            System.out.printf("{Lot %d}: ", i);
            generateNumbers(toto);
            printNumbers(toto);
            toto = clear();
        }
    }

    private static List<Integer> clear() {
        return initialize();
    }


    private static List<Integer> initialize() {
        return new ArrayList<Integer>(6)
                .stream()
                .map(i -> i = 0)
                .collect(Collectors.toList());
    }

    protected static List<Integer> generateNumbers(List<Integer> toto) {
        Random rand = new Random();
        for (int i = 0; i < 6; i++) {
            int num;
            do {
                num = 1 + rand.nextInt(49);
            } while (toto.contains(num));
            toto.add(i, num);
        }
        Collections.sort(toto);
        return toto;
    }

    static void printNumbers(List<Integer> toto) {
        for (int i : toto) {
            System.out.printf("%d ", i);
        }
        System.out.println();
    }
}
