package com.example.frontcliente.frontcliente;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDialog;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicHeader;
import org.apache.http.protocol.HTTP;
import org.json.JSONException;
import org.json.JSONObject;

import javax.swing.*;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.rmi.server.ExportException;
import java.sql.SQLException;
import java.util.Objects;
import java.util.ResourceBundle;

public class SignUpController implements Initializable {
    @FXML
    private Pane validPane;
    @FXML
    public static JFXDialog validDialog;
    @FXML
    private StackPane stackPane;

    @FXML
    private Pane pane;

    @FXML
    private JFXTextField dni;

    @FXML
    private JFXPasswordField password;

    @FXML
    private JFXButton btnAddUser;

    @FXML
    private JFXTextField names;

    @FXML
    private JFXTextField lastname;
    @FXML
    private JFXButton btnExit;
    @FXML
    void SignUP(ActionEvent event)  {

        new Thread(() -> {
            HttpClient client = HttpClientBuilder.create().build();
            HttpPost postRequest = new HttpPost("http://localhost:8080/users/add-user/");
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("dni", dni.getText());
            jsonObject.put("nombres", names.getText());
            jsonObject.put("apellidos", lastname.getText());
            jsonObject.put("password", password.getText());
            try {
                StringEntity se = new StringEntity(jsonObject.toString());
                se.setContentType(new BasicHeader(HTTP.CONTENT_TYPE, "application/json"));
                postRequest.setEntity(se);
                HttpResponse response = client.execute(postRequest);
            }catch (Exception e){
                System.out.println(e);
            }

        }).start();






            try {
                validPane = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/frontcliente/frontcliente/Mensaje.fxml")));
                validDialog = new JFXDialog(stackPane, validPane, JFXDialog.DialogTransition.CENTER);
                validDialog.show();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }








    }

    @FXML
    void exit(ActionEvent event) throws IOException {

        LoginController.validDialog.close();



    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
