package by.epamtc.gavrilovichivan.tests;

import by.epamtc.gavrilovichivan.ex4.EvenNumberFinder;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumberFinderTest {
    @Test
    public void hasTwoEvenTest() {
        boolean actual = true;

        boolean expected = EvenNumberFinder.hasTwoEven(1, 2, 3, 4);

        assertEquals(expected, actual);
    }
}