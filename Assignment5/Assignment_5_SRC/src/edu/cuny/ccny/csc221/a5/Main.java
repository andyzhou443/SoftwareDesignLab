package edu.cuny.ccny.csc221.a5;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Assignment5.fxml"));
        primaryStage.setTitle("Assignment 5 - Ayman Zeidan");
        primaryStage.setScene(new Scene(root, 850, 600));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
