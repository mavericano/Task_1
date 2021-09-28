package by.training.ex7;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class DistanceFinder {
    private static double countDistance(int x, int y, int x0, int y0) {

        return sqrt(pow(x - x0, 2) + pow(y - y0, 2));
    }

    /*
    * Returns less than 0 if the first point is closer
    * Returns more than 0 if the second point is closer
    * Returns 0 if the distances are equal
    */
    public static int compareDistance(int x1, int y1, int x2, int y2, int x0, int y0) {
        double firstDistance = countDistance(x1, y1, x0, y0);
        double secondDistance = countDistance(x2, y2, x0, y0);
        return Double.compare(firstDistance, secondDistance);
    }
}
