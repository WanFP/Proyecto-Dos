package com.example.labcasa;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;


import java.awt.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class GameInterface {

    int[][] tablero =new int[3][3];
    boolean xTurn,oTurn;
    int random, end;

    //Se definen los botones (casillas) del juego del gato
    Button b00=new Button("");
    Button b01=new Button("");
    Button b02=new Button("");
    Button b10=new Button("");
    Button b11=new Button("");
    Button b12=new Button("");
    Button b20=new Button("");
    Button b21=new Button("");
    Button b22=new Button("");

    //Contador para determinar el empate
    int tieCount=1;
    public GridPane interfaceGame(String nameX, String nameO){
        GridPane gP_interface = new GridPane();

        javafx.scene.text.Font font = javafx.scene.text.Font.font("Leelawadee UI", FontWeight.BOLD, 25);
        javafx.scene.text.Font font2 = Font.font("Leelawadee UI", FontWeight.BOLD, 12);

        //Se establecen los parametros del GridPane
        GridPane pane = new GridPane();
        pane.setStyle("-fx-background-color: #dae7ff");
        pane.getColumnConstraints().add(new ColumnConstraints(210));
        pane.getColumnConstraints().add(new ColumnConstraints(210));
        pane.getColumnConstraints().add(new ColumnConstraints(210));

        //Se define el botón reset
        Button reset =new Button("Reset");
        GridPane.setConstraints(reset,2,0);
        reset.setStyle("-fx-text-fill: white");
        reset.setStyle("-fx-background-color:#6673F4");
        reset.setFont(font2);


        //Se define el tamaño de los botones y sus colores
        b00.setStyle("-fx-background-color:#FACF5C");
        b00.setEffect(new DropShadow());
        b01.setStyle("-fx-background-color:#FACF5C");
        b01.setEffect(new DropShadow());
        b02.setStyle("-fx-background-color:#FACF5C");
        b02.setEffect(new DropShadow());
        b10.setStyle("-fx-background-color:#FACF5C");
        b10.setEffect(new DropShadow());
        b11.setStyle("-fx-background-color:#FACF5C");
        b11.setEffect(new DropShadow());
        b12.setStyle("-fx-background-color:#FACF5C");
        b12.setEffect(new DropShadow());
        b20.setStyle("-fx-background-color:#FACF5C");
        b20.setEffect(new DropShadow());
        b21.setStyle("-fx-background-color:#FACF5C");
        b21.setEffect(new DropShadow());
        b22.setStyle("-fx-background-color:#FACF5C");
        b22.setEffect(new DropShadow());

        b00.setPrefSize(200,195);
        GridPane.setConstraints(b00, 0, 1);
        b01.setMinSize(200,195);
        GridPane.setConstraints(b01, 1, 1);
        b02.setMinSize(200,195);
        GridPane.setConstraints(b02, 2, 1);
        b10.setMinSize(200,195);
        GridPane.setConstraints(b10, 0, 2);
        b11.setMinSize(200,195);
        GridPane.setConstraints(b11, 1, 2);
        b12.setMinSize(200,195);
        GridPane.setConstraints(b12, 2, 2);
        b20.setMinSize(200,195);
        GridPane.setConstraints(b20, 0, 3);
        b21.setMinSize(200,195);
        GridPane.setConstraints(b21, 1, 3);
        b22.setMinSize(200,195);
        GridPane.setConstraints(b22, 2, 3);


        pane.setPadding(new Insets(5,5,5,5));

        //Este label mostrará todos los mensajes en la escena del juego
        Label message = new Label("");
        message.setFont(font);
        message.setStyle("-fx-text-fill: #476aab");

        //Este random sirve para definir aleatoriamente quien comienza, incluso al presionar el botón reset
        random= 0 + (int)(Math.random()*2);

        if(random==1) {
            message.setText(nameX+"'s turn");
            xTurn=true;
            oTurn=false;
        }
        else {
            message.setText(nameO+"'s turn");
            xTurn=false;
            oTurn=true;
        }
        //Se da función al botón reset
        reset.setOnAction(event -> {

            tieCount=1;

            b00.setText("");
            b00.setStyle("-fx-background-color:#FACF5C");
            b00.setEffect(new DropShadow());
            b01.setText("");
            b01.setStyle("-fx-background-color:#FACF5C");
            b01.setEffect(new DropShadow());
            b02.setText("");
            b02.setStyle("-fx-background-color:#FACF5C");
            b02.setEffect(new DropShadow());
            b10.setText("");
            b10.setStyle("-fx-background-color:#FACF5C");
            b10.setEffect(new DropShadow());
            b11.setText("");
            b11.setStyle("-fx-background-color:#FACF5C");
            b11.setEffect(new DropShadow());
            b12.setText("");
            b12.setStyle("-fx-background-color:#FACF5C");
            b12.setEffect(new DropShadow());
            b20.setText("");
            b20.setStyle("-fx-background-color:#FACF5C");
            b20.setEffect(new DropShadow());
            b21.setText("");
            b21.setStyle("-fx-background-color:#FACF5C");
            b21.setEffect(new DropShadow());
            b22.setText("");
            b22.setStyle("-fx-background-color:#FACF5C");
            b22.setEffect(new DropShadow());


            random= 0 + (int)(Math.random()*2);

            if(random==0) {
                message.setText(nameX+"'s turn");
                xTurn=true;
                oTurn=false;
            }
            else {
                message.setText(nameO+"'s turn");
                xTurn=false;
                oTurn=true;
            }

            for(int r=0; r<3;r++)
            {
                for(int c=0; c<3; c++)
                {
                    tablero[r][c]='\0';
                }
            }
            b00.setDisable(false);
            b01.setDisable(false);
            b02.setDisable(false);
            b10.setDisable(false);
            b11.setDisable(false);
            b12.setDisable(false);
            b20.setDisable(false);
            b21.setDisable(false);
            b22.setDisable(false);


        });

        //A partir de aquí se le da a los botones de las casillas la función de llenar con X/O y
        //enviar a la matriz 0 o 1 dependiendo de si es X u O respectivamente
        b00.setOnAction(event -> {
            if(xTurn) {
                b00.setText("X");
                tablero[0][0] = 4;
                xTurn=false;
                oTurn=true;
                message.setText(returnHeaderMessage(nameO, nameX, nameO));
            }
            else{
                b00.setText("O");
                tablero[0][0] = 3;
                xTurn=true;
                oTurn=false;
                message.setText(returnHeaderMessage(nameX, nameX, nameO));
            }
            tieCount+=1;
            b00.setStyle("-fx-font-size:59");
            b00.setDisable(true);
        });
        b01.setOnAction(event -> {
            if(xTurn) {
                b01.setText("X");
                tablero[0][1] = 4;
                xTurn=false;
                oTurn=true;
                message.setText(returnHeaderMessage(nameO, nameX, nameO));
            }
            else{
                b01.setText("O");
                tablero[0][1] = 3;
                xTurn=true;
                oTurn=false;
                message.setText(returnHeaderMessage(nameX, nameX, nameO));
            }
            tieCount+=1;
            b01.setStyle("-fx-font-size:59");
            b01.setDisable(true);
        });
        b02.setOnAction(event -> {
            if(xTurn) {
                b02.setText("X");
                tablero[0][2] = 4;
                xTurn=false;
                oTurn=true;
                message.setText(returnHeaderMessage(nameO, nameX, nameO));
            }
            else{
                b02.setText("O");
                tablero[0][2] = 3;
                xTurn=true;
                oTurn=false;
                message.setText(returnHeaderMessage(nameX, nameX, nameO));
            }
            tieCount+=1;
            b02.setStyle("-fx-font-size:59");
            b02.setDisable(true);
        });
        b10.setOnAction(event -> {
            if(xTurn) {
                b10.setText("X");
                tablero[1][0] = 4;
                xTurn=false;
                oTurn=true;
                message.setText(returnHeaderMessage(nameO, nameX, nameO));
            }
            else {
                b10.setText("O");
                tablero[1][0] = 3;
                xTurn=true;
                oTurn=false;
                message.setText(returnHeaderMessage(nameX, nameX, nameO));
            }
            tieCount+=1;
            b10.setStyle("-fx-font-size:59");
            b10.setDisable(true);
        });
        b11.setOnAction(event -> {
            if(xTurn) {
                b11.setText("X");
                tablero[1][1] = 4;
                xTurn=false;
                oTurn=true;
                message.setText(returnHeaderMessage(nameO, nameX, nameO));
            }
            else {
                b11.setText("O");
                tablero[1][1] = 3;
                xTurn=true;
                oTurn=false;
                message.setText(returnHeaderMessage(nameX, nameX, nameO));
            }
            tieCount+=1;
            b11.setStyle("-fx-font-size:59");
            b11.setDisable(true);
        });
        b12.setOnAction(event -> {
            if(xTurn) {
                b12.setText("X");
                tablero[1][2] = 4;
                xTurn=false;
                oTurn=true;
                message.setText(returnHeaderMessage(nameO, nameX, nameO));
            }
            else {
                b12.setText("O");
                tablero[1][2] = 3;
                xTurn=true;
                oTurn=false;
                message.setText(returnHeaderMessage(nameX, nameX, nameO));
            }
            tieCount+=1;
            b12.setStyle("-fx-font-size:59");
            b12.setDisable(true);
        });
        b20.setOnAction(event -> {
            if(xTurn) {
                b20.setText("X");
                tablero[2][0] = 4;
                xTurn=false;
                oTurn=true;
                message.setText(returnHeaderMessage(nameO, nameX, nameO));
            }

            else {
                b20.setText("O");
                tablero[2][0] = 3;
                xTurn=true;
                oTurn=false;
                message.setText(returnHeaderMessage(nameX, nameX, nameO));
            }
            tieCount+=1;
            b20.setStyle("-fx-font-size:59");
            b20.setDisable(true);
        });
        b21.setOnAction(event -> {
            if(xTurn){
                b21.setText("X");
                tablero[2][1] = 4;
                xTurn=false;
                oTurn=true;
                message.setText(returnHeaderMessage(nameO, nameX, nameO));
            }
            else{
                b21.setText("O");
                tablero[2][1] = 3;
                xTurn=true;
                oTurn=false;
                message.setText(returnHeaderMessage(nameX, nameX, nameO));
            }
            tieCount+=1;
            b21.setStyle("-fx-font-size:59");
            b21.setDisable(true);
        });
        b22.setOnAction(event -> {
            if(xTurn) {
                b22.setText("X");
                tablero[2][2]=4;
                xTurn=false;
                oTurn=true;
                message.setText(returnHeaderMessage(nameO, nameX, nameO));
            }
            else{
                b22.setText("O");
                tablero[2][2]=3;
                xTurn=true;
                oTurn=false;
                message.setText(returnHeaderMessage(nameX, nameX, nameO));
            }
            tieCount+=1;
            b22.setStyle("-fx-font-size:59");
            b22.setDisable(true);
        });


        gP_interface.getChildren().addAll(message, reset, b00,b01,b02,b10,b11,b12,b20,b21,b22);
        return gP_interface;
    }
    //setWinner establece cual jugador gana
    public String setWinner(String playerX, String playerO){
        if (winnerX(tablero))
            return playerX;

        if (winnerO(tablero))
            return playerO;

        return "";
    }

    //Utilizando setWinner, returnHeaderMessage muestra al usuario quien es el ganador, la condición de empate
    //o continua con el siguiente turno
    public String returnHeaderMessage(String playerString, String playerX, String playerO){
        String winner = setWinner(playerX,playerO);
        if (winner!=""){
            b00.setDisable(true);
            b01.setDisable(true);
            b02.setDisable(true);
            b10.setDisable(true);
            b11.setDisable(true);
            b12.setDisable(true);
            b20.setDisable(true);
            b21.setDisable(true);
            b22.setDisable(true);
            return winner+" wins";
        }
        if (tieCount==9)
            return "It's a tie";

        return playerString+"´s turn";
    }

    //Condición de victoria del jugador X
    public boolean winnerX(int tablero[][]){

        boolean winningPlayer = false;
        int result=0;

        for(int filas=0; filas<tablero.length; filas++) {
            result = result + (tablero[filas][filas]);
            if(result==12) {
                winningPlayer=true;
                break;
            }
        }
        if (result!=12) {
            result=0;
            for (int filas = 0; filas < tablero.length; filas++) {
                result = result + (tablero[filas][(tablero.length - 1) - filas]);
                if (result == 12) {
                    winningPlayer = true;
                    break;
                }
            }
        }


        if (result!=12)
            for (int filas=0; filas<tablero.length; filas++) {
                result=0;
                for (int columnas = 0; columnas < tablero[0].length; columnas++) {
                    result = result + tablero[filas][columnas];
                }
                if(result==12) {
                    winningPlayer=true;
                    break;
                }
            }
        if (result!=12)
            for (int filas=0; filas<tablero.length; filas++) {
                result=0;
                for (int columnas = 0; columnas < tablero[0].length; columnas++) {
                    result = result + tablero[columnas][filas];
                }
                if(result==12) {
                    winningPlayer=true;
                    break;
                }
            }

        return winningPlayer;
    }

    //Condición de victoria del jugador O
    public boolean winnerO(int tablero[][]){

        boolean winningPlayer = false;
        int result=0;

        for(int filas=0; filas<tablero.length; filas++) {
            result = result + (tablero[filas][filas]);
            if(result==9) {
                winningPlayer=true;
                break;
            }
        }
        if (result!=9) {
            result=0;
            for (int filas = 0; filas < tablero.length; filas++) {
                result = result + (tablero[filas][(tablero.length - 1) - filas]);
                if (result == 9) {
                    winningPlayer = true;
                    break;
                }
            }
        }


        if (result!=9)
            for (int filas=0; filas<tablero.length; filas++) {
                result=0;
                for (int columnas = 0; columnas < tablero[0].length; columnas++) {
                    result = result + tablero[filas][columnas];
                }
                if(result==9) {
                    winningPlayer=true;
                    break;
                }
            }
        if (result!=9)
            for (int filas=0; filas<tablero.length; filas++) {
                result=0;
                for (int columnas = 0; columnas < tablero[0].length; columnas++) {
                    result = result + tablero[columnas][filas];
                }
                if(result==9) {
                    winningPlayer=true;
                    break;
                }
            }

        return winningPlayer;
    }

}
