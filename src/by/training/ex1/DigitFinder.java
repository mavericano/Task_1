package by.training.ex1;

public class DigitFinder {

    private static int getLastDigit(int number) {
        String stringNumber = Integer.toString(number);

        return Character.getNumericValue(stringNumber.charAt(stringNumber.length() - 1));
    }

    public static int getSquareLastDigit(int number) {
        int lastDigit = getLastDigit(number);

        return getLastDigit(lastDigit * lastDigit);
    }
}
