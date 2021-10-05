package by.epamtc.gavrilovichivan.runner;

import java.util.Scanner;

public class ConsoleReader {
    static final Scanner scanner = new Scanner(System.in);

    public static double readDouble() throws EmptyConsoleException {
        String input = scanner.nextLine();
        if (input.matches("^-?\\d+[.,]\\d+$")) {
            return Double.parseDouble(input);
        } else {
            throw new EmptyConsoleException("The console has no decimal numbers");
        }
    }


    public static int readInt() throws EmptyConsoleException {
        String input = scanner.nextLine();
        if (input.matches("^-?/d+$")) {
            return Integer.parseInt(input);
        } else {
            throw new EmptyConsoleException("The console has no integer numbers");
        }
    }
}
