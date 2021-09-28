package by.training.ex9;

import static java.lang.Math.pow;
import static java.lang.Math.PI;

public class AreaAndLengthComputer {
    private static double computeArea(double r) {
        return PI * pow(r, 2);
    }

    private static double computeLength(double r) {
        return 2 * PI * r;
    }

    /*
    * Returns an array, the first element is the area, the second element is length
    */
    public static double[] computeAreaAndLength(double r) {
        double[] result = new double[2];

        result[0] = computeArea(r);
        result[1] = computeLength(r);

        return result;
    }
}
