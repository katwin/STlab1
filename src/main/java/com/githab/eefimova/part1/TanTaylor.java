package com.githab.eefimova.part1;

import org.apache.commons.math3.fraction.BigFraction;

import static java.lang.Math.pow;
import java.math.BigInteger;


public class TanTaylor {
    public static final int steps = 10;

    public TanTaylor() {
    }


   public double cos(double x) {
        double taylor = 0;
        for (int n = 0; n < steps; n++){
            taylor = taylor + (Math.pow(-1, n) * (Math.pow(x, 2 * n))) / factorial(2 * n);
        }
        return taylor;
    }

    public double sin(double x) {
        double taylor = 0;
        for (int n = 0; n < steps; n++){
            taylor = taylor + (Math.pow(-1, n) * (Math.pow(x, 2 * n + 1))) / factorial(2 * n + 1);
        }
        return taylor;
    }

    public double tan3(double x) {
        double cos = cos(x);
        if (Math.abs(cos) < 1E-10) {
            return Double.POSITIVE_INFINITY;
        }
        return sin(x) / cos;
    }


    private static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
