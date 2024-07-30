package application.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

public class RemoveBooksController {
    @FXML
    private TextField titleField;
    @FXML
    private TextField authorField;
    @FXML
    private TextField isbnField;

    @FXML
    private void handleRemoveBook(ActionEvent event) {
        // Remove book from database logic
        String title = titleField.getText();
        String author = authorField.getText();
        String isbn = isbnField.getText();

        // Assuming a method removeBookFromDatabase() exists to remove the book from the database
        boolean success = removeBookFromDatabase(title, author, isbn);
        
        Alert alert = new Alert(success ? AlertType.INFORMATION : AlertType.ERROR);
        alert.setContentText(success ? "BOOK REMOVED SUCCESSFULLY" : "FAILED TO REMOVE BOOK");
        alert.showAndWait();
        
        if (success) {
            // Navigate to MainView.fxml without passing event
            NavigationService.navigateTo("application/view/MainView.fxml");
        }
    }

    private boolean removeBookFromDatabase(String title, String author, String isbn) {
        // Implement database logic here
        return true;
    }

    @FXML
    private void handleBackToMain(ActionEvent event) {
        // Navigate to MainView.fxml without passing event
        NavigationService.navigateTo("application/view/MainView.fxml");
    }
}
