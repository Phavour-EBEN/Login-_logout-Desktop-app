package com.example.test1;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    @FXML
    private Button btnCancle;

    @FXML
    private Button btnLogin;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private TextField txtUsername;

    @FXML
    private Button btnLogout;

    @FXML
    void onLogout(ActionEvent event) throws IOException {
        btnLogout.getScene().getWindow().hide();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        Stage stage = new Stage();
        stage.setTitle("Hello!");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void onCancle(ActionEvent event) {
        Platform.exit();

    }

    @FXML
    void onLogin(ActionEvent event) throws IOException {
        String userName = txtUsername.getText();
        String password = txtPassword.getText();
        Alert message = new Alert(Alert.AlertType.INFORMATION);
        if(userName.equals("admin")&&(password.equals("1234"))){
//            message.setContentText("Welcome "+userName);
//            message.setTitle("Welcome");
//            message.show();
            btnLogin.getScene().getWindow().hide();

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("MainApp.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 700, 600);
            Stage stage = new Stage();
            stage.setTitle("welcome");
//            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        }else{
            message.setContentText("Invalid Username or Password");
            message.setTitle("Unsuccessful Login");
            message.show();

        }
        txtUsername.setText("");
        txtPassword.setText("");

    }

}
