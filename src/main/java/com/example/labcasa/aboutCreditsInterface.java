package com.example.labcasa;

import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;

public class aboutCreditsInterface {

    public VBox interfaceAbout(){
        VBox vB_about = new VBox();

        TextArea tA_about = new TextArea();
        tA_about.setEditable(false);

        tA_about.setText("Juego de gato \nProgramado en Java\nVersión 1.0");
        Button bTn_closeAbout = new Button("Cerrar");

        bTn_closeAbout.setOnAction((actionEvent) -> {
            vB_about.setVisible(false);
        });

        vB_about.getChildren().addAll(tA_about, bTn_closeAbout);
        return vB_about;

    }
    public VBox interfaceCredits(){
        VBox vB_credits = new VBox();

        TextArea tA_credits = new TextArea();
        tA_credits.setEditable(false);

        tA_credits.setText("Autor: \nWanda Fuentes Pereira");
        Button bTn_closeCredits = new Button("Cerrar");

        bTn_closeCredits.setOnAction((actionEvent) -> {
            vB_credits.setVisible(false);
        });


        vB_credits.getChildren().addAll(tA_credits, bTn_closeCredits);
        return vB_credits;

    }


}
