package models;

import java.util.List;

@FunctionalInterface
public interface BookProcessor {
    void process(List<Books> mockedBooks);
}
