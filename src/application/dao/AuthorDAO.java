package application.dao;

import application.model.Author;
import java.util.ArrayList;
import java.util.List;

public class AuthorDAO {
    private List<Author> authors;

    public AuthorDAO() {
        authors = new ArrayList<>();
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public List<Author> getAllAuthors() {
        return authors;
    }
}
