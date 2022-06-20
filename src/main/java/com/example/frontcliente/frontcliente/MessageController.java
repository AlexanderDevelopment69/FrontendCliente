package com.example.frontcliente.frontcliente;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;


import java.net.URL;
import java.util.ResourceBundle;

public class MessageController implements Initializable {


    @FXML
    void SignIn(ActionEvent event) {

        LoginController.validDialog.close();

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
