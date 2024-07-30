package application.dao;

import application.model.Book;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDAO {

    public boolean addBook(Book book) {
        String query = "INSERT INTO books (book_id, title, author, genre, isbn) VALUES (?, ?, ?, ?, ?)";
        try (Connection connection = Database.getConnection();
             PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, book.getBookId());
            stmt.setString(2, book.getTitle());
            stmt.setString(3, book.getAuthor());
            stmt.setString(4, book.getGenre());
            stmt.setString(5, book.getIsbn());
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean removeBook(String bookId) {
        String query = "DELETE FROM books WHERE book_id = ?";
        try (Connection connection = Database.getConnection();
             PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, bookId);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Book> getAllBooks() {
        List<Book> books = new ArrayList<>();
        String query = "SELECT * FROM books";
        try (Connection connection = Database.getConnection();
             PreparedStatement stmt = connection.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                books.add(new Book(
                    rs.getString("book_id"),
                    rs.getString("title"),
                    rs.getString("author"),
                    rs.getString("genre"),
                    rs.getString("isbn")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return books;
    }
}
