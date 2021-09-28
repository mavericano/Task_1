package by.epamtc.gavrilovichivan.runner;

import java.util.Scanner;

public class ConsoleReader {
    static final Scanner scanner = new Scanner(System.in);

    public static double readDouble() throws EmptyConsoleException {
        if (scanner.hasNextDouble()) {
            return scanner.nextDouble();
        } else {
            throw new EmptyConsoleException("The console is empty");
        }
    }


    public static int readInt() throws EmptyConsoleException {
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            throw new EmptyConsoleException("The console is empty");
        }
    }
}
