package application.dao;

import application.model.Book;
import java.util.ArrayList;
import java.util.List;

public class BookDAO {
    private List<Book> books;

    public BookDAO() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public List<Book> getAllBooks() {
        return books;
    }
}
