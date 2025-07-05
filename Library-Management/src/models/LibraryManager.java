package models;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LibraryManager {
    private final List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void listBooks() {
        for (Book book : books) {
            System.out.println(book.getId() + "-" + book.getTitle() + "by" + book.getAuthor());
        }
    }

    public void removeBookById(Book book) {
        books.removeIf(book1 -> book.getId() ==book1.getId() );
    }

    public List<Book> findBook(String title) {
        List<Book> matchedBooks = new ArrayList<>();
        for (Book book : books) {
            if(book.getTitle().equalsIgnoreCase(title)) {
            matchedBooks.add(book);
            }
        }
        return matchedBooks;
    }

    public List<Book> getAllBooks() {
        return this.books;
    }

//    public void findBook(String title) {
//        Iterator<Book> iterator = books.iterator();
//        while(iterator.hasNext()) {
//            Book bookInList = iterator.next();
//            if(bookInList.getTitle() == title) {
//
//            }
//        }
//
//    }

//    public void removeBookById(Book book) {
//        Iterator<Book> iterator = books.iterator();
//        while(iterator.hasNext()) {
//            Book bookInList = iterator.next();
//            if(bookInList.getId() == book.getId()) {
//                iterator.remove();
//                break;
//            }
//        }
//    }


//    public void removeBookById(Book book) {
//        for (Book book1 : books) {
//            if(book1.getId() == book.getId()) {
//                books.remove(book);
//            }
//        }
//    }
}
