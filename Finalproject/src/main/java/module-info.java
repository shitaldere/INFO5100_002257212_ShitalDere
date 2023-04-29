module com.example.finalproject {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens com.example.finalproject to javafx.fxml;
    exports com.example.finalproject;
    //exports com.example.finalproject.util;
    //opens com.example.finalproject.util to javafx.fxml;
    //exports com.example.finalproject.controller;
    //opens com.example.finalproject.controller to javafx.fxml;
}