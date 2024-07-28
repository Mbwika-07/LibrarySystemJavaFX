package application.controller;

import application.dao.UserDAO;
import application.model.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class UserController {
    @FXML
    private TextField usernameField;
    @FXML
    private TextField passwordField;
    @FXML
    private TableView<User> userTable;

    private UserDAO userDAO;

    public UserController() {
        userDAO = new UserDAO();
    }

    @FXML
    private void handleAddUser(ActionEvent event) {
        String username = usernameField.getText();
        String password = passwordField.getText();

        User user = new User(username, password);
        userDAO.addUser(user);
        userTable.getItems().add(user);
    }
}
