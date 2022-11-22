package com.example.labcasa;

public class Game {
    private String namePlayer;
    private String statusGame;
    private String dateGame;
    private String timeGame;

    //Definir el constructor
    //Clic derecho generate, constructor
    //Clid derecho generate, setter y getter
    public Game(String namePlayer, String statusGame, String dateGame, String timeGame) {
        this.namePlayer = namePlayer;
        this.statusGame = statusGame;
        this.dateGame = dateGame;
        this.timeGame = timeGame;
    }

    public String getNamePlayer() {
        return namePlayer;
    }

    public void setNamePlayer(String namePlayer) {
        this.namePlayer = namePlayer;
    }

    public String getStatusGame() {
        return statusGame;
    }

    public void setStatusGame(String statusGame) {
        this.statusGame = statusGame;
    }

    public String getDateGame() {
        return dateGame;
    }

    public void setDateGame(String dateGame) {
        this.dateGame = dateGame;
    }

    public String getTimeGame() {
        return timeGame;
    }

    public void setTimeGame(String timeGame) {
        this.timeGame = timeGame;
    }
}
