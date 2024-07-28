package application.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class LoginController {
    @FXML
    private TextField usernameField;
    @FXML
    private TextField passwordField;

    @FXML
    private void handleLogin(ActionEvent event) {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (authenticateUser(username, password)) {
            System.out.println("User logged in: " + username);
        } else {
            showLoginError();
        }
    }

    private boolean authenticateUser(String username, String password) {
        return "admin".equals(username) && "admin".equals(password);
    }

    private void showLoginError() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Login Error");
        alert.setHeaderText(null);
        alert.setContentText("Invalid username or password. Please try again.");
        alert.showAndWait();
    }
}
