package day02.numbers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PerfectNumbersTest {

    public PerfectNumbers perfectNumbers;

    @BeforeEach
    void init() {
        perfectNumbers = new PerfectNumbers();
    }

    @Test
    void testEquals() {
        boolean test = true;
        assertEquals(test,perfectNumbers.isPerfectNumber(6));
        assertEquals(test,perfectNumbers.isPerfectNumber(8128));
        assertNotEquals(test,perfectNumbers.isPerfectNumber(7246));
        assertNotEquals(test,perfectNumbers.isPerfectNumber(9));

    }

}
