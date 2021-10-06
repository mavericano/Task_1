package test;

import by.epamtc.gavrilovichivan.ex2.DayFinder;
import org.junit.Test;

import static org.junit.Assert.*;

public class DayFinderTest {

    @Test
    public void countDays_Not_Leap() {
        int expected = 28;

        int actual = DayFinder.countDays(2019, 2);

        assertEquals(expected, actual);
    }

    @Test
    public void countDays_Leap() {
        int expected = 29;

        int actual = DayFinder.countDays(2020, 2);

        assertEquals(expected, actual);
    }
}