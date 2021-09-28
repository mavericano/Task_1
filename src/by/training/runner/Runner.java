package by.training.runner;

import by.training.ex1.DigitFinder;
import by.training.ex10.FunctionComputer;

public class Runner {

    public static void main(String[] args) {
        String table = FunctionComputer.buildTable(1, 20, 1);

        System.out.println(table);
    }

}
