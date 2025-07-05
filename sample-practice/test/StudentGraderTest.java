import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentGraderTest {
     StudentGrader studentGrader;

    @BeforeEach
    void setUp() {
        studentGrader = new StudentGrader();
    }

    @Test
    void testMarksBtw50And59() {
        assertEquals("D", studentGrader.getGrade(53));
    }

    @Test
    void testMarksAbove90() {
        assertEquals("A+", studentGrader.getGrade(95));
    }

    @Test
    void testMarksBtw70And79() {
        assertEquals("B", studentGrader.getGrade(78));
    }

    @Test
    void testMarksBtw80And89() {
        assertEquals("A", studentGrader.getGrade(89));
    }

    @Test
    void testMarksBtw60And69() {
        assertEquals("C", studentGrader.getGrade(69));
    }

    @Test
    void testMarksBelow50() {
        assertEquals("F", studentGrader.getGrade(43));
    }

    @Test
    void testException() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> studentGrader.getGrade(-3));
        assertEquals("Invalid Marks", exception.getMessage());
    }
}