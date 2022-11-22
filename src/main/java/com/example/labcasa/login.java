package com.example.labcasa;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;

public class login {

    GameInterface gI = new GameInterface();
    public GridPane loginClass(){

        GridPane pane = new GridPane();

        pane.getColumnConstraints().add(new ColumnConstraints(360));
        pane.getColumnConstraints().add(new ColumnConstraints(360));
        pane.getColumnConstraints().add(new ColumnConstraints(360));


        Label lB_tittleLogin = new Label("Tic Tac Toe");
        GridPane.setConstraints(lB_tittleLogin, 1,1);

        Label lB_welcomeMessage = new Label("Welcome");
        GridPane.setConstraints(lB_welcomeMessage, 1,2);
        Label lB_loginInfo = new Label("Please enter your credentials to start playing");
        GridPane.setConstraints(lB_loginInfo, 1,3);
        Label lB_loginInfo2 = new Label("If you don´t have an account please click on ´new user´");
        GridPane.setConstraints(lB_loginInfo2, 1,4);

        Label lB_username = new Label("Username");
        GridPane.setConstraints(lB_username, 1,5);
        TextField tF_usernameSpace = new TextField();
        GridPane.setConstraints(tF_usernameSpace, 1,6);

        Label lB_password = new Label("Password");
        GridPane.setConstraints(lB_password, 1,7);
        PasswordField pF_passwordSpace = new PasswordField();
        GridPane.setConstraints(pF_passwordSpace, 1,8);

        Button bT_enter = new Button("Validate password");
        GridPane.setConstraints(bT_enter, 1,9);
        bT_enter.setOnAction((event) -> {
            pane.getChildren().clear();
            pane.getChildren().addAll(gI.interfaceGame("Wan", "Kat"));
        });

        Button bT_newUser = new Button("New User");
        GridPane.setConstraints(bT_newUser, 1,10);

        pane.getChildren().addAll(lB_tittleLogin, lB_welcomeMessage, lB_loginInfo,lB_loginInfo2,lB_username, tF_usernameSpace, lB_password, pF_passwordSpace, bT_enter, bT_newUser);
        return pane;
    }
}
