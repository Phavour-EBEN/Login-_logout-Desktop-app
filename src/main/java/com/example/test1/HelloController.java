package com.example.test1;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
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
    private Button btnLoadImage;


    @FXML
    private Button btnOpenTextFile;

    @FXML
    private Button btnPlotGraph;

    @FXML
    private Button btnSaveTextFile;

    @FXML
    private Button btnShowEditor;

    @FXML
    private Button btnSowGraph;

    @FXML
    private Button btnViewImage;

    @FXML
    private MenuItem font10;

    @FXML
    private MenuItem font12;

    @FXML
    private MenuItem font18;

    @FXML
    private MenuItem font20;

    @FXML
    private MenuItem fontTypeArial;

    @FXML
    private MenuItem fontTypeFantasy;

    @FXML
    private MenuItem fontTypeMonospace;

    @FXML
    private MenuItem fontTypeNewTimes;

    @FXML
    private ImageView imgImageView;

    @FXML
    private LineChart<String,Integer> lineGraph;

    @FXML
    private MenuItem menuAbout;

    @FXML
    private MenuItem mnClose;

    @FXML
    private BorderPane paneDeveloper;


    @FXML
    private BorderPane paneEditor;

    @FXML
    private BorderPane paneGraph;

    @FXML
    private BorderPane paneImage;

    @FXML
    private TextArea txtEditor;

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
    public void about(){
        paneDeveloper.setVisible(true);
        paneEditor.setVisible(false);
        paneGraph.setVisible(false);
        paneImage.setVisible(false);
        btnLoadImage.setVisible(false);
        btnSaveTextFile.setVisible(false);
        btnPlotGraph.setVisible(false);
        btnOpenTextFile.setVisible(false);
    }

    public void vewTextEditor(){
        paneDeveloper.setVisible(false);
        paneEditor.setVisible(true);
        paneGraph.setVisible(false);
        paneImage.setVisible(false);
        btnLoadImage.setVisible(false);
        btnSaveTextFile.setVisible(true);
        btnPlotGraph.setVisible(false);
        btnOpenTextFile.setVisible(true);
    }
    public void viewImages(){
        paneDeveloper.setVisible(false);
        paneEditor.setVisible(false);
        paneGraph.setVisible(false);
        paneImage.setVisible(true);
        btnLoadImage.setVisible(true);
        btnSaveTextFile.setVisible(false);
        btnPlotGraph.setVisible(false);
        btnOpenTextFile.setVisible(false);
    }
    public void viewGraph(){
        paneDeveloper.setVisible(false);
        paneEditor.setVisible(false);
        paneGraph.setVisible(true);
        paneImage.setVisible(false);
        btnLoadImage.setVisible(false);
        btnSaveTextFile.setVisible(false);
        btnPlotGraph.setVisible(true);
        btnOpenTextFile.setVisible(false);
    }
    public void font10(){
        txtEditor.setFont(Font.font(10));
    }

    public void font12(){
        txtEditor.setFont(Font.font(12));
    }
    public void font18(){
        txtEditor.setFont(Font.font(18));
    }
    public void font20(){
        txtEditor.setFont(Font.font(20));
    }
    public void fontArial(){
        txtEditor.setFont(Font.font("Arail",FontPosture.REGULAR,12));
    }
    public void fontMonspace(){
        txtEditor.setFont(Font.font("Monospace"));
    }
    public void fontNewTimesRoman(){
        txtEditor.setFont(Font.font("New Times Roman",FontPosture.ITALIC,12));
    }
    public void fontFantasy(){
        txtEditor.setFont(Font.font("Fantasy", FontPosture.ITALIC,20));
    }

}
