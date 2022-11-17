package ex5sample;

import java.util.ArrayList;

public class Book {
    private String title;
    private String genre;
    private ArrayList<Author> authors = new ArrayList<>();

    public Book(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public ArrayList<Author> getAuthors() {
        return authors;
    }

    public void addAuthor(Author a) {
        authors.add(a);
    }
}
