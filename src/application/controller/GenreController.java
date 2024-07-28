package application.controller;

import application.dao.GenreDAO;
import application.model.Genre;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class GenreController {
    @FXML
    private TextField nameField;
    @FXML
    private TableView<Genre> genreTable;

    private GenreDAO genreDAO;

    public GenreController() {
        genreDAO = new GenreDAO();
    }

    @FXML
    private void handleAddGenre(ActionEvent event) {
        String name = nameField.getText();

        Genre genre = new Genre(name);
        genreDAO.addGenre(genre);
        genreTable.getItems().add(genre);
    }
}
