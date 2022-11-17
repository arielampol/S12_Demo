package ex5sample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    // using Set guarantees that all authors exist only once in this collection
    private Set<Author> authors = new HashSet<>();
    private String name;

    public Library(String name) {
        this.name = name;
    }

    public void addBook(Book b) {
        books.add(b);
        authors.addAll(b.getAuthors());
    }

    public void printLibraryReport() {
        Map<String, Long> genreToCountMap = books.stream()
                .collect(Collectors.groupingBy(Book::getGenre, Collectors.counting()));

        System.out.printf("Library \"%s\" has %d books and %d unique authors.\n\n",
                            name, books.size(), authors.size());

        System.out.println("Genre\t|\tNumber of Books");
        for(String genre : genreToCountMap.keySet())
            System.out.printf("%s\t|\t%d\n", genre, genreToCountMap.get(genre));

        System.out.println();

        // The below section works, but it's far too advanced
        Map<Author, Long> authorToCountMap = books.stream().map(Book::getAuthors).flatMap(ArrayList::stream)
                .collect(Collectors.groupingBy(author -> author, Collectors.counting()));
        System.out.println("Author\t|\tNumber of Books");
        for(Author author : authorToCountMap.keySet())
            System.out.printf("%s\t|\t%d\n", author, authorToCountMap.get(author));
    }
}
