package com.nullnumber1.task1;

public class CosPowerSeries {

    // cos(x) = 1 - x^2/2! + x^4/4! - x^6/6! + ... + (-1)^n * x^(2n) / (2n)!
    public static double calculate(double x, int n) {
        if (Double.isNaN(x)) {
            return Double.NaN;
        } else if (Double.isInfinite(x)) {
            return Double.NaN;
        }

        double result = 0;
        for (int i = 0; i <= n; i++) {
            int sign = (i % 2 == 0) ? 1 : -1;
            double numerator = Math.pow(x, 2 * i);
            double denominator = factorial(2 * i);
            result += sign * (numerator / denominator);
        }
        return result;
    }

    private static double factorial(int n) {
        double result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
