package application.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;


public class ViewUsersController {
    @FXML
    private TableView<?> userTable;
    @FXML
    private TableColumn<?, ?> nameColumn;
    @FXML
    private TableColumn<?, ?> idColumn;
    @FXML
    private TableColumn<?, ?> passwordColumn;

    @FXML
    private void handleBackToMain(ActionEvent event) {
        // Use NavigationService for navigation
        NavigationService.navigateTo("application/view/MainView.fxml");
    }
}
