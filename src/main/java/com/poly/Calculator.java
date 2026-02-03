package com.poly;

public class Calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Không thể chia cho 0");
        }
        return a / b;
    }

    public double parseNumber(String input) {
        if (input == null) {
            throw new NullPointerException("Chuỗi đầu vào bị null");
        }
        return Double.parseDouble(input);
    }
}


