package by.epamtc.gavrilovichivan.ex5;

import java.util.ArrayList;

public class PerfectFinder {

    private static ArrayList<Integer> getDividers(int number) {
        ArrayList<Integer> dividers = new ArrayList<>();
        dividers.add(1);
        dividers.add(number);
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) { dividers.add(i);}
        }
        return dividers;
    }

    private static int countSum(ArrayList<Integer> dividers) {
        int sum = 0;
        for (int divider : dividers) {
            sum += divider;
        }
        return sum;
    }

    public static boolean isPerfect(int number) {
        ArrayList<Integer> dividers = getDividers(number);
        int sum = countSum(dividers);
        return number == sum;
    }
}
