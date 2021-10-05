package by.epamtc.gavrilovichivan.tests;

import by.epamtc.gavrilovichivan.ex2.DayFinder;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DayFinderTest {

    @Test
    public void countDays() {
        int actual = 28;

        int expected = DayFinder.countDays(2019, 2);

        assertEquals(expected, actual);
    }
}