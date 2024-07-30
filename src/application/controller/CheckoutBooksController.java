package application.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

public class CheckoutBooksController {
    @FXML
    private TextField bookIdField;
    @FXML
    private TextField userIdField;
    @FXML
    private TextField dueDateField;

    @FXML
    private void handleCheckoutBook(ActionEvent event) {
        // Checkout book logic
        String bookId = bookIdField.getText();
        String userId = userIdField.getText();
        String dueDate = dueDateField.getText();

        // Assuming a method checkoutBook() exists to checkout the book
        boolean success = checkoutBook(bookId, userId, dueDate);
        
        Alert alert = new Alert(success ? AlertType.INFORMATION : AlertType.ERROR);
        alert.setContentText(success ? "BOOK CHECKED OUT SUCCESSFULLY" : "FAILED TO CHECKOUT BOOK");
        alert.showAndWait();
        
        if (success) {
            // Navigate to MainView.fxml without passing event
            NavigationService.navigateTo("application/view/MainView.fxml");
        }
    }

    private boolean checkoutBook(String bookId, String userId, String dueDate) {
        // Implement database logic here
        return true;
    }

    @FXML
    private void handleBackToMain(ActionEvent event) {
        // Navigate to MainView.fxml without passing event
        NavigationService.navigateTo("application/view/MainView.fxml");
    }
}
