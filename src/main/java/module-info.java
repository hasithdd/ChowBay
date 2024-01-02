module com.example.bakeryshop {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bakeryshop to javafx.fxml;
    exports com.example.bakeryshop;
}