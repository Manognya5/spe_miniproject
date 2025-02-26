package com.manognya;


public class Calculator {
    public static double SquareRoot(double n1) {
        double result = -1;
        if (n1 >= 0) {
            result = Math.sqrt(n1);
        }
        else {
            throw new IllegalArgumentException("Square root of negative numbers is not a real number.");
        }
        return result;
    }

    public static int Factorial(int n1) {
        int result = 1;
        if (n1 < 0) {
            throw new IllegalArgumentException("Factorial of negative numbers is not defined.");
        }
        else if (n1 == 0) {
            return result;
        }
        else {
            for (int i = 1; i <= n1; i++) {
                result *= i;
            }

            return result;
        }
    }

    public static double NaturalLog(double n1) {
        if (n1 <= 0) {
            throw new IllegalArgumentException("Natural log of negative numbers is not defined.");
        }
        return Math.log(n1);
    }

    public static double Power(double base, double exponent) {
        double res = -1;
        try {
            res = Math.pow(base, exponent);
        }catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
        return res;
    }
}
