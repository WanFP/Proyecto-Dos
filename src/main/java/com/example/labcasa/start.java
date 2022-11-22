package com.example.labcasa;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class start {

    public GridPane startGame(){
        StackPane stack = new StackPane();
        GridPane Nodes = new GridPane();

        //Imagen de fondo en la ventana
        Image image = new Image("background.jpeg");
        ImageView back = new ImageView(image);
        back.setFitHeight(650);
        back.setFitWidth(1100);


        Nodes.setAlignment(Pos.CENTER);
        Nodes.getColumnConstraints().add(new ColumnConstraints(200)); // column 0 is 100 wide
        Nodes.getColumnConstraints().add(new ColumnConstraints(100));
        Nodes.getColumnConstraints().add(new ColumnConstraints(300));
        Nodes.getColumnConstraints().add(new ColumnConstraints(100));
        Nodes.getColumnConstraints().add(new ColumnConstraints(250));




        Font font = Font.font("Gill Sans MT", FontWeight.BOLD, 48);
        Font font3 = Font.font("Gill Sans MT", 18);
        Font font2 = Font.font("Leelawadee UI", FontWeight.BOLD, 12);


        Label lB_gameTitle = new Label(" Tic Tac Toe");
        GridPane.setConstraints(lB_gameTitle, 2,2);
        lB_gameTitle.setFont(font);
        lB_gameTitle.setStyle("-fx-text-fill: white");
        Label lB_welcome = new Label("   Welcome");
        GridPane.setConstraints(lB_welcome, 2, 5);
        lB_welcome.setFont(font);
        lB_welcome.setStyle("-fx-text-fill: white");
        Button bT_start = new Button("Start Game");
        GridPane.setConstraints(bT_start, 1, 8);
        bT_start.setFont(font2);
        bT_start.setPrefWidth(100);
        bT_start.setEffect(new DropShadow()); //start

        Label lB_name1 = new Label("Enter the name of player X");
        GridPane.setConstraints(lB_name1, 0,10);
        lB_name1.setFont(font3);
        lB_name1.setStyle("-fx-text-fill: white");


        TextField tF_name1 = new TextField();
        GridPane.setConstraints(tF_name1, 0,11);
        tF_name1.setPrefSize(10,20);

        Label lB_name2 = new Label("Enter the name of player O");
        GridPane.setConstraints(lB_name2, 4,10);
        lB_name2.setFont(font3);
        lB_name2.setStyle("-fx-text-fill: white");

        TextField tF_name2 = new TextField();
        GridPane.setConstraints(tF_name2, 4,11);
        tF_name1.setPrefSize(10,20);




        //Label mensaje vacía
        Label lB_messages = new Label("");
        lB_messages.setFont(font3);
        lB_messages.setStyle("-fx-text-fill: white");
        GridPane.setConstraints(lB_messages,2,14);

        bT_start.setOnMousePressed(event -> {

                    String n1 = tF_name1.getText();
                    String n2 = tF_name2.getText();

                    //Nombre jugador 1 vacio
                    if (n1.equals("")) {
                        System.out.println("n1" + n1);
                        lB_messages.setText("Please introduce both names"); //label mensaje
                    } else

                        //Nombre jugador 2 vacío
                        if (n2.equals("")) {
                            System.out.println("n2" + n2);
                            lB_messages.setText("Please introduce both names"); //label mensaje
                        } else {
                            Nodes.getChildren().clear();
                            Nodes.getChildren().addAll();
                        }
                });




        bT_start.setStyle("-fx-background-color:#6673F4"); //botón start


        Nodes.getChildren().addAll(back, lB_gameTitle, lB_welcome, bT_start,  lB_name1, tF_name1, lB_name2, tF_name2, lB_messages);





        Nodes.setHgap(5);
        Nodes.setVgap(5);




        return Nodes;
    }
}
