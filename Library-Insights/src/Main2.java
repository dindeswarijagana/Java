import models.Books;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {
        List<Books> books = List.of(
                new Books(1, "Think Straight", "Darius Foroux"),
                new Books(2, "Atomic Habits", "James Clear"),
                new Books(3, "Deep Work", "Cal Newport"),
                new Books(4, "Can't Hurt Me", "David Goggins"),
                new Books(5, "Think Again", "Adam Grant"),
                new Books(6, "The Power of Habit", "Charles Duhigg"),
                new Books(7, "Atomic Habits", "James Clear"),
                new Books(8, "So Good They Can't Ignore You", "Cal Newport"),
                new Books(9, "Everything is F*cked", "Mark Manson"),
                new Books(10, "The Subtle Art of Not Giving a F*ck", "Mark Manson")
        );
        Map<String, List<Books>>result = books.stream().filter(book -> book.getTitle().length() > 10).collect(Collectors.groupingBy(Books::getAuthor));
        System.out.println("result is"+ result);
    }
}
