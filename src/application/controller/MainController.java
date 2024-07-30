package application.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MainController {

    @FXML
    private void handleViewUsers(ActionEvent event) {
        navigateTo("ViewUser.fxml");
    }

    @FXML
    private void handleAddUsers(ActionEvent event) {
        navigateTo("AddUsers.fxml");
    }

    @FXML
    private void handleRemoveUsers(ActionEvent event) {
        navigateTo("RemoveUsers.fxml");
    }

    @FXML
    private void handleViewBooks(ActionEvent event) {
        navigateTo("ViewBooks.fxml");
    }

    @FXML
    private void handleAddBooks(ActionEvent event) {
        navigateTo("AddBooks.fxml");
    }

    @FXML
    private void handleRemoveBooks(ActionEvent event) {
        navigateTo("RemoveBooks.fxml");
    }

    @FXML
    private void handleCheckoutBooks(ActionEvent event) {
        navigateTo("CheckoutBooks.fxml");
    }

    @FXML
    private void handleReturnBooks(ActionEvent event) {
        navigateTo("ReturnBooks.fxml");
    }

    private void navigateTo(String fxmlFile) {
        NavigationService.navigateTo(fxmlFile);
    }
}
