package com.example.bakeryshop;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;

public class HelloController {

    @FXML
    private MenuItem about;

    @FXML
    private Button bananacart;

    @FXML
    private Button cartButton;

    @FXML
    private MenuItem close;

    @FXML
    private Button cornbreadcart;

    @FXML
    private Button donutcart;

    @FXML
    private Button muffincart;

    @FXML
    private Button piecart;

    @FXML
    private Button pretzelscart;

    @FXML
    private Button puffcart;

    @FXML
    private Button velvetcart;

    @FXML
    void aboutClick(ActionEvent event) {
        Alert newAlert = new Alert(Alert.AlertType.INFORMATION);
        newAlert.setTitle("About us");
        newAlert.setHeaderText("We are Bluebirds Developers");
        newAlert.show();
    }

    @FXML
    void bananacartClick(ActionEvent event) {
        Alert newAlert = new Alert(Alert.AlertType.CONFIRMATION);
        newAlert.setTitle("BlueBird Bakery Shop");
        newAlert.setHeaderText("Banana Bread");
        newAlert.setContentText("You just added 01 item");
        newAlert.show();
    }

    @FXML
    void cartClick(ActionEvent event) {

    }

    @FXML
    void closeClick(ActionEvent event) {
    System.exit(0);
    }

    @FXML
    void cornbreadClick(ActionEvent event) {

    }

    @FXML
    void donutcartClick(ActionEvent event) {

    }

    @FXML
    void muffincartClick(ActionEvent event) {

    }

    @FXML
    void piecartClick(ActionEvent event) {

    }

    @FXML
    void pretzelscartClick(ActionEvent event) {

    }

    @FXML
    void puffcartClick(ActionEvent event) {

    }

    @FXML
    void valvetcartClick(ActionEvent event) {

    }

}
