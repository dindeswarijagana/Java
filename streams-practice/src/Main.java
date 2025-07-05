import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Anita");
        System.out.println(names);
        playOnStreams(names);
    }

    public static void playOnStreams(List<String> names) {
        List<String> upperNames = names.stream().map(String::toUpperCase).toList();
        System.out.println("upperNames" + upperNames);
    }
}
