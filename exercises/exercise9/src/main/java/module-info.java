module com.example.jvjv {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.jvjv to javafx.fxml;
    exports com.example.jvjv;
}