package application.controller;

import application.dao.BookDAO;
import application.model.Book;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class BookController {
    @FXML
    private TextField titleField;
    @FXML
    private TextField authorField;
    @FXML
    private TextField genreField;
    @FXML
    private TextField isbnField;
    @FXML
    private TableView<Book> bookTable;

    private BookDAO bookDAO;

    public BookController() {
        bookDAO = new BookDAO();
    }

    @FXML
    private void handleAddBook(ActionEvent event) {
        String title = titleField.getText();
        String author = authorField.getText();
        String genre = genreField.getText();
        String isbn = isbnField.getText();

        Book book = new Book(title, author, genre, isbn);
        bookDAO.addBook(book);
        bookTable.getItems().add(book);
    }
}
