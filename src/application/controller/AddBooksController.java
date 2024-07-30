package application.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

public class AddBooksController {
    @FXML
    private TextField bookIdField;
    @FXML
    private TextField titleField;
    @FXML
    private TextField authorField;
    @FXML
    private TextField genreField;
    @FXML
    private TextField isbnField;

    @FXML
    private void handleAddBook(ActionEvent event) {
        // Add book to database logic
        String bookId = bookIdField.getText();
        String title = titleField.getText();
        String author = authorField.getText();
        String genre = genreField.getText();
        String isbn = isbnField.getText();

        // Assuming a method addBook() exists to add the book to the database
        boolean success = addBookToDatabase(bookId, title, author, genre, isbn);
        
        Alert alert = new Alert(success ? AlertType.INFORMATION : AlertType.ERROR);
        alert.setContentText(success ? "BOOK ADDED SUCCESSFULLY" : "FAILED TO ADD BOOK");
        alert.showAndWait();
        
        if (success) {
            NavigationService.navigateTo("application/view/MainView.fxml");
        }
    }

    private boolean addBookToDatabase(String bookId, String title, String author, String genre, String isbn) {
        // Implement database logic here
        return true;
    }

    @FXML
    private void handleBackToMain(ActionEvent event) {
        NavigationService.navigateTo("application/view/MainView.fxml");
    }
}
