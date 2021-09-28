package by.training.ex1;

public class DigitFinder {

    private static int getLastDigit(int number) {
        return number % 10;
    }

    public static int getSquareLastDigit(int number) {
        int lastDigit = getLastDigit(number);

        return getLastDigit(lastDigit * lastDigit);
    }
}
