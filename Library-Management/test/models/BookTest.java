package models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
     Book book;
    @BeforeEach
    void setUp() {
        book = new Book(1,"think-straight", "darius forex");
    }

    @Test
    void testGetId() {
        assertEquals(1, book.getId());
    }

    @Test
    void testGetTitle() {
        assertEquals("think-straight", book.getTitle());
    }

    @Test
    void testGetAuthor() {
        assertEquals("darius forex", book.getAuthor());
    }
}