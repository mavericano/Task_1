package by.training.ex2;

public class DayFinder {

    private static boolean isLeap(int year) {

        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
    }

    public static int countDays(int year, int month) {
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                return 31;
            case 4, 6, 9, 11:
                return 30;
            case 2:
                if (isLeap(year)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return 0;
        }
    }
}
