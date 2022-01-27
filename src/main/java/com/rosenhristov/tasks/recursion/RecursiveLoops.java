package com.rosenhristov.tasks.recursion;

import java.util.Scanner;

public class RecursiveLoops {

    public int numberOfLoops;
    public int numberOfIterations;
    public int[] loops;

    public static void main(String[] args) {
        RecursiveLoops box = new RecursiveLoops();
        Scanner input = new Scanner(System.in);
        System.out.print("N = ");
        box.numberOfLoops = input.nextInt();

        System.out.print("K = ");
        box.numberOfIterations = input.nextInt();
        input.close();

        box.loops = new int[box.numberOfLoops];
        box.nestedLoops(0);
    }

    public void nestedLoops(int currentLoop) {
        if (currentLoop == numberOfLoops) {
            printLoops();
            return;
        }
        for (int i = 1; i <= numberOfIterations; i++) {
            loops[currentLoop] = i;
            nestedLoops(currentLoop + 1);
        }
    }

    public void printLoops() {
        for (int i = 0; i < numberOfLoops; i++) {
            System.out.printf("%d ", loops[i]);
        }
        System.out.println();
    }
}
