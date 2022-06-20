package com.example.frontcliente.frontcliente;

import animatefx.animation.FadeIn;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDialog;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;


import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicHeader;
import org.apache.http.protocol.HTTP;
import org.json.JSONObject;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;


public class LoginController implements Initializable {
    @FXML
    private Pane validPane;
    @FXML
    public static JFXDialog validDialog;
    @FXML
    private StackPane stackPane;

    @FXML
    private Pane pane;

    @FXML
    private JFXTextField username;

    @FXML
    private JFXPasswordField password;

    @FXML
    private JFXButton btnIngresar;

    @FXML
    void exit(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void ingresarKey(KeyEvent event) {












    }

    @FXML
    void login(ActionEvent event) throws IOException {






    }
    @FXML
    void addAcount(ActionEvent event) throws IOException {

        try {
            validPane = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/frontcliente/frontcliente/RegistroUsuario.fxml")));
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        validDialog = new JFXDialog(stackPane, validPane, JFXDialog.DialogTransition.CENTER);
        validDialog.show();



//        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/frontcliente/frontcliente/RegistroUsuario.fxml"));
//        Parent root = loader.load();
//        Stage stage = new Stage();
//        stage.initStyle( StageStyle.UNDECORATED );
//
//        Scene scene=new Scene(root);
//        new FadeIn(root).play();
//        scene.setFill(Color.BLACK);
//        stage.setScene(scene);
////                stage.setScene(new Scene(root));
//        stage.show();
//        Stage myStage = (Stage) this.btnIngresar.getScene().getWindow();
//        myStage.close();

    }
    @FXML
    void recoveryUserPassword(ActionEvent event) {





    }




    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}