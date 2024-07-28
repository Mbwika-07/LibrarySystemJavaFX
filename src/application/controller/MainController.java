package application.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import application.model.Book;
import application.dao.BookDAO;

public class MainController {
    @FXML
    private TableView<Book> bookTable;
    @FXML
    private TableColumn<Book, String> titleColumn;
    @FXML
    private TableColumn<Book, String> authorColumn;
    @FXML
    private TableColumn<Book, String> genreColumn;
    @FXML
    private TableColumn<Book, String> isbnColumn;

    private BookDAO bookDAO;
    private ObservableList<Book> bookData;

    public MainController() {
        bookDAO = new BookDAO();
        bookData = FXCollections.observableArrayList(bookDAO.getAllBooks());
    }

    @FXML
    private void initialize() {
        titleColumn.setCellValueFactory(new PropertyValueFactory<>("title"));
        authorColumn.setCellValueFactory(new PropertyValueFactory<>("author"));
        genreColumn.setCellValueFactory(new PropertyValueFactory<>("genre"));
        isbnColumn.setCellValueFactory(new PropertyValueFactory<>("isbn"));

        bookTable.setItems(bookData);
    }

    @FXML
    private void handleAddBook() {
        Book newBook = new Book("New Title", "New Author", "New Genre", "New ISBN");
        bookDAO.addBook(newBook);
        bookData.add(newBook);
    }

    @FXML
    private void handleRemoveBook() {
        Book selectedBook = bookTable.getSelectionModel().getSelectedItem();
        if (selectedBook != null) {
            bookDAO.removeBook(selectedBook);
            bookData.remove(selectedBook);
        }
    }

    @FXML
    private void handleCheckOutBook() {
        // Implementation for checking out a book
    }

    @FXML
    private void handleReturnBook() {
        // Implementation for returning a book
    }

    @FXML
    private void handleAddUser() {
        // Implementation for adding a user
    }

    @FXML
    private void handleRemoveUser() {
        // Implementation for removing a user
    }
}
