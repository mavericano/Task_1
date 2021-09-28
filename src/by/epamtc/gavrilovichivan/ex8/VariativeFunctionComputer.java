package by.epamtc.gavrilovichivan.ex8;

import static java.lang.Math.pow;

public class VariativeFunctionComputer {
    private static double computeFirstVariant(double x) {
        return (-pow(x, 2) + 3 * x + 9);
    }

    private static double computeSecondVariant(double x) {
        return (1 / pow(x, 3) - 6);
    }

    public static double computeFunction(double x) {
        return x < 3 ? computeSecondVariant(x) : computeFirstVariant(x);
    }
}
