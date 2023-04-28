package com.example.finalproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

public class ImageManagementTool extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root1 = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        Scene sc1 = new Scene(root1);
        sc1.getStylesheets().add("design.css");
        primaryStage.setScene(sc1);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}