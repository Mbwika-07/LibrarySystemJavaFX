package application.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ViewBooksController {
    @FXML
    private TableView<?> bookTable;
    @FXML
    private TableColumn<?, ?> bookIdColumn;
    @FXML
    private TableColumn<?, ?> titleColumn;
    @FXML
    private TableColumn<?, ?> authorColumn;
    @FXML
    private TableColumn<?, ?> genreColumn;
    @FXML
    private TableColumn<?, ?> isbnColumn;

    @FXML
    private void handleBackToMain(ActionEvent event) {
        // Navigate to MainView.fxml without passing event
        NavigationService.navigateTo("application/view/MainView.fxml");
    }
}
