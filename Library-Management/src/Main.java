import models.Book;
import models.LibraryManager;

public class Main {
    public static void main(String[] args) {
        LibraryManager libraryManager = new LibraryManager();
        System.out.println("before adding book");
        libraryManager.listBooks();
        libraryManager.addBook(new Book(1, "think-straight", "Darius Forex"));
        libraryManager.addBook(new Book(2, "can we be strangers", "Don't know"));
        libraryManager.addBook(new Book(3, "Harry potter", "Jk Rowling"));
        System.out.println("after adding book");
        libraryManager.listBooks();
        libraryManager.removeBookById(new Book(1, "think-straight", "Darius Forex"));
        System.out.println("after removing book");
        libraryManager.listBooks();
        System.out.println("researched books" + libraryManager.findBook("Harry potter"));
        System.out.println("All books-list" + libraryManager.getAllBooks());
    }
}
