package application.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

public class ReturnBooksController {
    @FXML
    private TextField bookIdField;
    @FXML
    private TextField userIdField;

    @FXML
    private void handleReturnBook(ActionEvent event) {
        // Return book logic
        String bookId = bookIdField.getText();
        String userId = userIdField.getText();

        // Assuming a method returnBook() exists to return the book
        boolean success = returnBook(bookId, userId);
        
        Alert alert = new Alert(success ? AlertType.INFORMATION : AlertType.ERROR);
        alert.setContentText(success ? "BOOK RETURNED SUCCESSFULLY" : "FAILED TO RETURN BOOK");
        alert.showAndWait();
        
        if (success) {
            // Navigate to MainView.fxml without passing event
            NavigationService.navigateTo("application/view/MainView.fxml");
        }
    }

    private boolean returnBook(String bookId, String userId) {
        // Implement database logic here
        return true;
    }

    @FXML
    private void handleBackToMain(ActionEvent event) {
        // Navigate to MainView.fxml without passing event
        NavigationService.navigateTo("application/view/MainView.fxml");
    }
}
