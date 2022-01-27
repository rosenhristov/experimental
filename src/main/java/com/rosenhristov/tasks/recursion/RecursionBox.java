package com.rosenhristov.tasks.recursion;

import java.util.Scanner;

public class RecursionBox {

    public static long[] numbers;

    public static void main(String[] args) {
        RecursionBox box = new RecursionBox();
        Scanner input = new Scanner(System.in);

        System.out.print("n = ");

        int n = input.nextInt();

        numbers = new long[n + 2];
        numbers[1] = 1;
        numbers[2] = 1;

        long result = box.fib(n);

        System.out.printf("Fibonacci:%d = %d%n", n, result);

        input.close();
    }

    public long fib(int n) {
        if (0 == numbers[n])
            numbers[n] = fib(n - 1) + fib(n - 2);
        return numbers[n];
    }

    public long factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

}