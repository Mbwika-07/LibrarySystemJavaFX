package application.controller;

import application.dao.AuthorDAO;
import application.model.Author;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class AuthorController {
    @FXML
    private TextField nameField;
    @FXML
    private TextField bioField;
    @FXML
    private TableView<Author> authorTable;

    private AuthorDAO authorDAO;

    public AuthorController() {
        authorDAO = new AuthorDAO();
    }

    @FXML
    private void handleAddAuthor(ActionEvent event) {
        String name = nameField.getText();
        String bio = bioField.getText();

        Author author = new Author(name, bio);
        authorDAO.addAuthor(author);
        authorTable.getItems().add(author);
    }
}
