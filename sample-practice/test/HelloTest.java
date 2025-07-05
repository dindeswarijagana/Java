import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloTest {
    @Test
    void testFact() {
        assertEquals(120, Hello.getFact(5));
    }
}