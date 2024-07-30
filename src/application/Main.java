package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import application.controller.NavigationService;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            // Set the primary stage for navigation service
            NavigationService.setStage(primaryStage);

            // Load the initial view
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/view/MainView.fxml"));
            Parent root = loader.load();
            
            Scene scene = new Scene(root);
            scene.getStylesheets().add(getClass().getResource("/application/application.css").toExternalForm());
            primaryStage.setTitle("Library Management System Group D2 Assignment & CAT");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
