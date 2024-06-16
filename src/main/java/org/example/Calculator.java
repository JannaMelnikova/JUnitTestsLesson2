package org.example;


public class Calculator {





    // Метод для сложения
    public double add(double a, double b) {
        return a + b;
    }

    // Метод для вычитания
    public double subtract(double a, double b) {
        return a - b;
    }

    // Метод для умножения
    public double multiply(double a, double b) {
        return a * b;
    }

    // Метод для деления
    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }

    // Метод для получения квадратного корня
    public double sqrt(double a) {
        if (a < 0) {
            throw new IllegalArgumentException("Cannot take the square root of a negative number");
        }

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return Math.sqrt(a);
    }

    // Метод для проверки, является ли число простым
    public boolean isPrime(int a) {
        if (a <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}