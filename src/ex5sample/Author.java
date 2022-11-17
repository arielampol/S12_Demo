package ex5sample;

import java.util.Objects;

public class Author {
    private String name;
    private String genre;

    public Author(String name, String genre) {
        this.name = name;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return name + ", writer of " + genre ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(getName(), author.getName()) && Objects.equals(getGenre(), author.getGenre());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getGenre());
    }
}

