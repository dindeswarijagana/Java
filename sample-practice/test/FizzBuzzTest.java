import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    void testGetFizzBuzzRes() {
        assertEquals("Fizz", FizzBuzz.getFizzBuzzRes(3));
        assertEquals("Buzz", FizzBuzz.getFizzBuzzRes(5));
        assertEquals("Fizz Buzz", FizzBuzz.getFizzBuzzRes(15));
    }
}