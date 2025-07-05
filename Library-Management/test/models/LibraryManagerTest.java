package models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryManagerTest {
    List<Book> mockedBooks = new ArrayList<>();
    List<Book> listToBeMatched = new ArrayList<>();
    LibraryManager libraryManager;

    @BeforeEach
    void setUp() {
        libraryManager = new LibraryManager();
        mockedBooks.add(new Book(1, "think-straight", "Darius Forex"));
        mockedBooks.add(new Book(2, "can we be strangers", "Don't know"));
        mockedBooks.add(new Book(3, "Harry potter", "Jk Rowling"));

        for (Book mockedBook : mockedBooks) {
            libraryManager.addBook(mockedBook);
        }
    }

    @Test
    void testAddBook() {
        Book bookToAdd = new Book(4, "my-book", "me");
        mockedBooks.add(bookToAdd);
        libraryManager.addBook(bookToAdd);
        assertEquals(mockedBooks, libraryManager.getAllBooks());
    }

    @Test
    void testRemoveBook() {
        Book bookToRemove = new Book(1, "think-straight", "Darius Forex");
        mockedBooks.removeIf(book1 -> book1.getId() == bookToRemove.getId());
        libraryManager.removeBookById(bookToRemove);
//        System.out.println("All Books---->" + libraryManager.getAllBooks());
        assertEquals(mockedBooks, libraryManager.getAllBooks());
    }

    @Test
    void testFindBookByTitle() {
        mockedBooks.add(new Book(1, "think-straight", "Darius Forex"));
        libraryManager.addBook(new Book(2, "think-straight", "Darius Forex"));
        listToBeMatched.add(new Book(1, "think-straight", "Darius Forex"));
        listToBeMatched.add(new Book(2, "think-straight", "Darius Forex"));

        assertEquals(listToBeMatched, libraryManager.findBook("think-straight"));
    }
}