package by.epamtc.gavrilovichivan.runner;

import java.util.Scanner;

public class ConsoleReader {
    static final Scanner scanner = new Scanner(System.in);

    public static double readDouble() {
        String input;
        boolean isIncorrect;
        do {
            input = scanner.nextLine();
            isIncorrect = !input.matches("^-?\\d+[.,]\\d+$");
        } while (isIncorrect);
        return Double.parseDouble(input);
    }


    public static int readInt() {
        String input;
        boolean isIncorrect;
        do {
            input = scanner.nextLine();
            isIncorrect = !input.matches("^-?\\d+$");
        } while (isIncorrect);
        return Integer.parseInt(input);
    }
}
