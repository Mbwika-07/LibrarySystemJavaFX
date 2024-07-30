package application.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

public class AddUsersController {
    @FXML
    private TextField usernameField;
    @FXML
    private TextField idField;
    @FXML
    private TextField passwordField;

    @FXML
    private void handleAddUser(ActionEvent event) {
        // Add user to database logic
        String username = usernameField.getText();
        String id = idField.getText();
        String password = passwordField.getText();

        // Assuming a method addUser() exists to add the user to the database
        boolean success = addUserToDatabase(username, id, password);
        
        Alert alert = new Alert(success ? AlertType.INFORMATION : AlertType.ERROR);
        alert.setContentText(success ? "USER ADDED SUCCESSFULLY" : "FAILED TO ADD USER");
        alert.showAndWait();
        
        if (success) {
            // Navigate to MainView.fxml without passing event
            NavigationService.navigateTo("application/view/MainView.fxml");
        }
    }

    private boolean addUserToDatabase(String username, String id, String password) {
        // Implement database logic here
        return true;
    }

    @FXML
    private void handleBackToMain(ActionEvent event) {
        // Navigate to MainView.fxml without passing event
        NavigationService.navigateTo("application/view/MainView.fxml");
    }
}
