import models.BookProcessor;
import models.Books;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Books books = new Books(1, "think-straight", "Darius forex");
//        System.out.println(books.getId());
//        System.out.println(books.getTitle());
//        System.out.println(books.getAuthor());

        List<Books> mockedBooks = new ArrayList<>();

        mockedBooks.add(new Books(1, "Think Straight", "Darius Foroux"));
        mockedBooks.add(new Books(2, "Think Straight", "Darius Foroux"));
        mockedBooks.add(new Books(3, "Deep Work", "Cal Newport"));
        mockedBooks.add(new Books(4, "So Good They Can't Ignore You", "Cal Newport"));
        mockedBooks.add(new Books(5, "Atomic Habits", "James Clear"));
        mockedBooks.add(new Books(6, "The Power of Habit", "Charles Duhigg"));
        mockedBooks.add(new Books(7, "Atomic Habits", "James Clear"));
        mockedBooks.add(new Books(8, "The Subtle Art of Not Giving a F*ck", "Mark Manson"));
        mockedBooks.add(new Books(9, "Everything is F*cked", "Mark Manson"));
        mockedBooks.add(new Books(10, "Can't Hurt Me", "David Goggins"));


//        BookProcessor printUniqueAuthors = (booksList) -> {
//            Set<String> uniqueAuthors = new HashSet<>();
//            for (Books book : booksList) {
//                uniqueAuthors.add(book.getAuthor());
//            }
//            uniqueAuthors.forEach(System.out::println);
//        };
//
//    printUniqueAuthors.process(mockedBooks);
//
//    BookProcessor printBooksPerAuthor = (booksList) -> {
//        Set<String> uniqueAuthors = new HashSet<>();
//        Map<String, Integer> booksPerAuthor = new HashMap<>();
//
//        for (Books book1 : booksList) {
//            uniqueAuthors.add(book1.getAuthor());
//        }
//        for(String author : uniqueAuthors) {
//            int authorCount = 0;
//            for (Books book2 : booksList) {
//                if (author.equals(book2.getAuthor())) {
//                    authorCount += 1;
//                }
//            }
//            booksPerAuthor.put(author, authorCount);
//        }
//
//        for (Map.Entry<String, Integer> entry : booksPerAuthor.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }
//    };
//
//    printBooksPerAuthor.process(mockedBooks);

//    cleaned version for printBooksPerAuthor method
//        BookProcessor printBooksPerAuthor = (books) -> {
//            Map<String, Integer> authorCountMap = new HashMap<>();
//            for (Book book : books) {
//                authorCountMap.merge(book.getAuthor(), 1, Integer::sum);
//            }
//
//            authorCountMap.forEach((author, count) ->
//                    System.out.println(author + ": " + count));
//        };


        //cleaned version for printUniqueAuthors method

//        BookProcessor printUniqueAuthors = (books) -> {
//            books.stream()
//                    .map(Book::getAuthor)
//                    .distinct()
//                    .forEach(System.out::println);
//        };
        System.out.println(mockedBooks);
    }

}
