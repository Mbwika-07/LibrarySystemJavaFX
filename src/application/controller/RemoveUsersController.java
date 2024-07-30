package application.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

public class RemoveUsersController {
    @FXML
    private TextField usernameField;
    @FXML
    private TextField idField;

    @FXML
    private void handleRemoveUser(ActionEvent event) {
        // Remove user from database logic
        String username = usernameField.getText();
        String id = idField.getText();

        // Assuming a method removeUserFromDatabase() exists to remove the user from the database
        boolean success = removeUserFromDatabase(username, id);
        
        Alert alert = new Alert(success ? AlertType.INFORMATION : AlertType.ERROR);
        alert.setContentText(success ? "USER REMOVED SUCCESSFULLY" : "FAILED TO REMOVE USER");
        alert.showAndWait();
        
        if (success) {
            // Navigate to MainView.fxml without passing event
            NavigationService.navigateTo("application/view/MainView.fxml");
        }
    }

    private boolean removeUserFromDatabase(String username, String id) {
        // Implement database logic here
        return true;
    }

    @FXML
    private void handleBackToMain(ActionEvent event) {
        // Navigate to MainView.fxml without passing event
        NavigationService.navigateTo("application/view/MainView.fxml");
    }
}
