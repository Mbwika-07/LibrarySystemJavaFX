package application.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CheckoutDAO {

    public boolean checkoutBook(String bookId, String userId, String dueDate) {
        String query = "INSERT INTO checkouts (book_id, user_id, due_date) VALUES (?, ?, ?)";
        try (Connection connection = Database.getConnection();
             PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, bookId);
            stmt.setString(2, userId);
            stmt.setString(3, dueDate);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean returnBook(String bookId, String userId) {
        String query = "DELETE FROM checkouts WHERE book_id = ? AND user_id = ?";
        try (Connection connection = Database.getConnection();
             PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, bookId);
            stmt.setString(2, userId);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
