package com.example.labcasa;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage)  {
    //test
        interfaceMenu iM = new interfaceMenu();
        Scene scene = new Scene(iM.getVbox(), 1100, 650);

        primaryStage.setTitle("Ejemplo de Menu");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args){
        launch(args);
    }

}
