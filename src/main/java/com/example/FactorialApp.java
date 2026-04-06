package com.example;

public class FactorialApp {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a number.");
            return;
        }
        try {
            int n = Integer.parseInt(args[0]);
            long factorial = calculateFactorial(n);
            System.out.println("Factorial of " + n + " is " + factorial);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number.");
        }
    }

    public static long calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Negative numbers not allowed");
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}