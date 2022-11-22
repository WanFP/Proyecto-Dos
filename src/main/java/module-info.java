module com.example.labcasa {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.labcasa to javafx.fxml;
    exports com.example.labcasa;
}