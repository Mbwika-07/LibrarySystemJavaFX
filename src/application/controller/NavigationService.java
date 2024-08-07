package application.controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class NavigationService {
    private static Stage primaryStage;

    public static void setStage(Stage stage) {
        primaryStage = stage;
        System.out.println("Primary stage set: " + primaryStage);
    }

    public static void navigateTo(String fxmlFile) {
        if (primaryStage == null) {
            throw new IllegalStateException("Primary stage is not set");
        }

        try {
            FXMLLoader loader = new FXMLLoader(NavigationService.class.getResource("/application/view/" + fxmlFile));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            scene.getStylesheets().add(NavigationService.class.getResource("/application/application.css").toExternalForm());
            primaryStage.setScene(scene);
            primaryStage.setMaximized(true); // Ensure full screen
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
