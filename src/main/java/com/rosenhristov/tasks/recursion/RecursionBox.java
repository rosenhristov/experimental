package com.rosenhristov.tasks.recursion;

import java.util.Scanner;

public class RecursionBox {

    public static long[] numbers;

    public static void main(String[] args) {
        RecursionBox box = new RecursionBox();
        Scanner input = new Scanner(System.in);

        System.out.print("n = ");
        int n = input.nextInt();

        long fibonacciRecursive = box.fibonacciRecursive(n);
        numbers = null;
        System.out.printf("Recursive Fibonacci:[%d] = %d%n", n, fibonacciRecursive);

        long factorialRecursive = box.factorial(n);
        numbers = null;
        System.out.printf("Recursive Factorial of [%d] = %d%n", n, factorialRecursive);

        long fibonacciIterative = box.fibonacciIterative(n);
        numbers = null;
        System.out.printf("Iterative Fibonacci:[%d] = %d%n", n, fibonacciIterative);

        long factorialIterative = box.factorialIterative(n);
        numbers = null;
        System.out.printf("Iterative Factorial of [%d] = %d%n", n, factorialIterative);


        input.close();
    }

    public long fibonacciRecursive(int n) {
        if (numbers == null) {
            numbers = new long[n+1];
        }
        numbers[0] = 0;
        numbers[1] = 1;
        if (n > 1) {
            numbers[n] = fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
        }
        return numbers[n];
    }

    // iterative Approach
    public long fibonacciIterative(int n) {
        if (numbers == null) {
            numbers = new long[n + 1];
        }
        numbers[0] = 0;
        numbers[1] = 1;
        for (int i = 2; i < numbers.length; i++) {
            numbers[i] = numbers[i - 1] + numbers[i - 2];
        }
        return numbers[n];
    }

    public long factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    //iterativeApproach
    public long factorialIterative(int n) {
        for (int i = n - 1; i > 0; i--) {
            n *= i;
        }
        return n;
    }

}