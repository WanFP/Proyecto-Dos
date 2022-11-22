package com.example.labcasa;

import javafx.application.Platform;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;


public class interfaceMenu {
    aboutCreditsInterface aCI = new aboutCreditsInterface();
    GameInterface gI = new GameInterface();
    ReportInterface rI = new ReportInterface();

    login lN=new login();


    public VBox getVbox(){
        VBox vB_main = new VBox();
        vB_main.setStyle("-fx-background-image:url(Fondo.jpg);"
        +"-fx-background-position:left top, center;"
        +"-fx-background-repeat:no-repeat;"
        +"-fx-background-size:cover,auto;");

        //Este VBox administra las ventanas del menú
        VBox vB_windows = new VBox();

        MenuBar mB_menu = new MenuBar();
        Menu m_system = new Menu("Game");

        MenuItem mI_About=new MenuItem("Credits-About");
        mI_About.setOnAction((event) -> {
            //JOptionPane.showMessageDialog(null, "Acerca de...");
            vB_windows.getChildren().clear();
            vB_windows.getChildren().addAll(aCI.interfaceAbout());
        });

        MenuItem mI_login=new MenuItem("Login");
        mI_login.setOnAction((event) -> {
            vB_windows.getChildren().clear();
            vB_windows.getChildren().addAll(lN.loginClass());
        });


        MenuItem mI_credits = new MenuItem("Change Password");
        mI_credits.setOnAction((event) -> {
            vB_windows.getChildren().clear();
            vB_windows.getChildren().addAll(aCI.interfaceCredits());
        });

        MenuItem mI_exit = new MenuItem("Exit");
        mI_exit.setOnAction((event) -> Platform.exit());

        m_system.getItems().addAll(mI_About, mI_login, mI_credits, mI_exit);

        Menu m_Games = new Menu("Settings");

        ImageView iV_generateGame = new ImageView(new Image("joystick.png"));

        MenuItem mI_generateGames = new MenuItem("Change fichas", iV_generateGame);
        mI_generateGames.setOnAction(actionEvent -> {

            vB_windows.getChildren().clear();
            vB_windows.getChildren().addAll(gI.interfaceGame("Kat", "Wan"));
        });

        m_Games.getItems().addAll(mI_generateGames);

        Menu m_ReportGame = new Menu("Reports");
        MenuItem mI_reportDataFile = new MenuItem("Reporte partidas");
        mI_reportDataFile.setOnAction(actionEvent -> {
            vB_windows.getChildren().addAll();
            vB_windows.getChildren().addAll(rI.interfaceReports());
        });

        m_ReportGame.getItems().addAll(mI_reportDataFile);

        mB_menu.getMenus().addAll(m_system, m_Games, m_ReportGame);

        vB_main.getChildren().addAll(mB_menu, vB_windows);
        return vB_main;
    }
}
