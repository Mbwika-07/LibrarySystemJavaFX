package application.controller;

import application.dao.CheckedOutBookDAO;
import application.model.CheckedOutBook;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class CheckedOutBookController {
    @FXML
    private TextField bookIdField;
    @FXML
    private TextField userIdField;
    @FXML
    private TextField dueDateField;
    @FXML
    private TableView<CheckedOutBook> checkedOutBookTable;

    private CheckedOutBookDAO checkedOutBookDAO;

    public CheckedOutBookController() {
        checkedOutBookDAO = new CheckedOutBookDAO();
    }

    @FXML
    private void handleCheckOutBook(ActionEvent event) {
        int bookId = Integer.parseInt(bookIdField.getText());
        int userId = Integer.parseInt(userIdField.getText());
        String dueDate = dueDateField.getText();

        CheckedOutBook checkedOutBook = new CheckedOutBook(bookId, userId, dueDate);
        checkedOutBookDAO.checkOutBook(checkedOutBook);
        checkedOutBookTable.getItems().add(checkedOutBook);
    }

    @FXML
    private void handleReturnBook(ActionEvent event) {
        int bookId = Integer.parseInt(bookIdField.getText());
        int userId = Integer.parseInt(userIdField.getText());

        checkedOutBookDAO.returnBook(bookId, userId);
        checkedOutBookTable.getItems().removeIf(book -> book.getBookId() == bookId && book.getUserId() == userId);
    }
}
