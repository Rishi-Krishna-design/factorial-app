package com.example;

public class FactorialApp {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide numbers.");
            return;
        }
        for (String arg : args) {
            try {
                int n = Integer.parseInt(arg);
                long factorial = calculateFactorial(n);
                System.out.println("Factorial of " + n + " is " + factorial);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number: " + arg);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage() + " for " + arg);
            }
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