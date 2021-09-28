package by.training.ex4;

public class EvenNumberFinder {

    private static boolean isEven(int number) {
        return (number % 2 == 0);
    }

    public static boolean hasTwoEven(int a, int b, int c, int d) {
        boolean toStay = true;
        int i = 0;
        int amountOfEven = 0;

        if (isEven(a)) {
            amountOfEven++;
        }
        if (isEven(b)) {
            amountOfEven++;
        }
        if (isEven(c) && amountOfEven < 2) {
            amountOfEven++;
        }
        if (isEven(d) && amountOfEven < 2) {
            amountOfEven++;
        }

        return amountOfEven > 1;
    }
}
