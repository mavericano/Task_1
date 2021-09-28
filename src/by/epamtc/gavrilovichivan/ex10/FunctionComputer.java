package by.epamtc.gavrilovichivan.ex10;

import static java.lang.Math.tan;

public class FunctionComputer {

    private static double computeFunction(double x) {
        return tan(x);
    }

    public static String buildTable(double lowerDiapason, double upperDiapason, double step) {
        StringBuilder str = new StringBuilder();
        str.append("| x | y |\n");

        for (double i = lowerDiapason; i <= upperDiapason; i += step) {
            str.append("| ").append(String.format("%.4f", i)).append(" | ").append(String.format("%.4f", tan(i))).append(" |\n");
            str.append("-----------------------\n");
        }

        return str.toString();
    }
}
