module com.example.ejemplo_anchorpane {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ejemplo_anchorpane to javafx.fxml;
    exports com.example.ejemplo_anchorpane;
}