package by.training.ex3;

import static java.lang.Math.sqrt;

public class AreaComputer {
    private static double computeSquareArea(double r) {
        return 2 * r * r;
    }

    private static double computeRadius(double area) {
        return sqrt(area) / 2;
    }

    public static double computeArea(double biggerArea) {
        double r = computeRadius(biggerArea);
        return computeSquareArea(r);
    }
}
