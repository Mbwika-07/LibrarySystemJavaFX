package application.dao;

import application.model.CheckedOutBook;
import java.util.ArrayList;
import java.util.List;

public class CheckedOutBookDAO {
    private List<CheckedOutBook> checkedOutBooks;

    public CheckedOutBookDAO() {
        checkedOutBooks = new ArrayList<>();
    }

    public void checkOutBook(CheckedOutBook checkedOutBook) {
        checkedOutBooks.add(checkedOutBook);
    }

    public void returnBook(int bookId, int userId) {
        checkedOutBooks.removeIf(book -> book.getBookId() == bookId && book.getUserId() == userId);
    }

    public List<CheckedOutBook> getAllCheckedOutBooks() {
        return checkedOutBooks;
    }
}
