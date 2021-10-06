package test;

import by.epamtc.gavrilovichivan.ex4.EvenNumberFinder;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumberFinderTest {
    @Test
    public void hasTwoEvenTest_Two_Even() {
        boolean expected = true;

        boolean actual = EvenNumberFinder.hasTwoEven(1, 2, 3, 4);

        assertEquals(expected, actual);
    }

    @Test
    public void hasTwoEvenTest_Three_Even() {
        boolean expected = true;

        boolean actual = EvenNumberFinder.hasTwoEven(6, 2, 3, 4);

        assertEquals(expected, actual);
    }

    @Test
    public void hasTwoEvenTest_Four_Even() {
        boolean expected = true;

        boolean actual = EvenNumberFinder.hasTwoEven(6, 2, 8, 4);

        assertEquals(expected, actual);
    }

    @Test
    public void hasTwoEvenTest_One_Even() {
        boolean expected = false;

        boolean actual = EvenNumberFinder.hasTwoEven(1, 5, 3, 4);

        assertEquals(expected, actual);
    }

    @Test
    public void hasTwoEvenTest_Zero_Even() {
        boolean expected = false;

        boolean actual = EvenNumberFinder.hasTwoEven(1, 5, 3, 7);

        assertEquals(expected, actual);
    }
}