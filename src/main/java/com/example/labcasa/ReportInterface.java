package com.example.labcasa;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

import java.util.ArrayList;

public class ReportInterface {
    logicFile lF = new logicFile();
    public VBox interfaceReports() {
        VBox vB_interface = new VBox();

        Label lB_Games = new Label("Reporte de partidas");
        lB_Games.setTextFill(Color.AQUAMARINE);
        lB_Games.setFont(new Font("Arial", 20));

        TableView<Game> tV_Games = new TableView<>();

        //Establece las columnas según los datos en Game.
        TableColumn tC_NamePlayer = new TableColumn("Nombre Jugador");
        tC_NamePlayer.setCellValueFactory(new PropertyValueFactory("namePlayer")); //Nombre exacto según Game.

        TableColumn tC_statusGame = new TableColumn("Estado juego");
        tC_statusGame.setCellValueFactory(new PropertyValueFactory("statusGame"));

        TableColumn tC_dateGame = new TableColumn("Fecha juego");
        tC_dateGame.setCellValueFactory(new PropertyValueFactory("dateGame"));

        TableColumn tC_timeGame = new TableColumn("Tiempo juego");
        tC_timeGame.setCellValueFactory(new PropertyValueFactory("timeGame"));

        //Agrega las columnas del TableView como un contenedor.
        tV_Games.getColumns().addAll(tC_NamePlayer, tC_statusGame, tC_dateGame, tC_timeGame);

        //Vincula los datos definidos en g1 (Game) en el TableView.
        tV_Games.setItems(getListGameFile());

        Button bTn_closeWindow = new Button("Cerrar reporte");
        bTn_closeWindow.setOnAction((actionEvent) -> {
            vB_interface.setVisible(false);
        });


        vB_interface.getChildren().addAll(lB_Games, tV_Games, bTn_closeWindow);
        return vB_interface;
    }

    //Este método se encarga de rellenar los datos en el TableView
    public ObservableList<Game> getListGameFile(){
        ArrayList arrayData = new ArrayList();

        //Retorno del arreglo, ordena y sobre escribe en el archivo <-
        lF.fileDataSort(lF.bubbleSortArray(lF.getDataFileToArray()));

        Game arrayGames[] = lF.getDataFileToArray();

        //Recorre el arreglo de Game y lo pone sobre quien toma esos datos individualmente.
        for(Game g:arrayGames)
            arrayData.add(g);

        ObservableList<Game> list = FXCollections.observableArrayList(arrayData);

    return list;
    }
}