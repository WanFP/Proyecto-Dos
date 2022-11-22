package com.example.labcasa;

import javax.swing.*;
import java.io.*;
import java.util.StringTokenizer;

public class logicFile {

    public PrintStream getWriteFile(String nameFile, boolean statusDataFile){
        PrintStream ps = null;

        File file = new File(nameFile);
        try {
            FileOutputStream fos = new FileOutputStream(file, statusDataFile);

            ps = new PrintStream(fos);
        }catch (FileNotFoundException fnfe){
            JOptionPane.showMessageDialog(null, "Problemas con el archivo "+fnfe);
        }
        return ps;
    }


    public BufferedReader getReadFile(String nameFile){
        BufferedReader br = null;

        File file = new File(nameFile);
        try {
            FileInputStream fis = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(fis);
            br = new BufferedReader(isr);
        }catch (FileNotFoundException fnfe){
            JOptionPane.showMessageDialog(null,"Problemas con el archivo "+fnfe);
        }

        return br;
    }

    public void insertGameInFile(Game g){

        PrintStream ps = getWriteFile("game.txt",true);

        ps.println(g.getNamePlayer()+";"+g.getStatusGame()+";"+g.getDateGame()+";"+g.getTimeGame());
    }

    //Determinar la cantidad de registros que tiene el archivo game.txt
    public int countData(){

        BufferedReader br = getReadFile("game.txt"); //Lee game.txt
        int countDataGame = 0; //Cuenta los datos existentes en el archivo

        String lineRegisterFile = "";

            try {
                while (lineRegisterFile != null) {
                    lineRegisterFile = br.readLine();

                    if(lineRegisterFile!=null)
                        countDataGame++;
                }
            } catch (IOException ioe) {
                JOptionPane.showMessageDialog(null, "Problemas con el archivo");
            }
    return countDataGame;
    }

    public Game[] getDataFileToArray(){

        Game arrayGames[] = new Game[countData()];
        BufferedReader br = getReadFile("game.txt");
        int indexArray =0;

        try {
            String lineRegisterFile = br.readLine();
            while (lineRegisterFile !=null){

                StringTokenizer sT = new StringTokenizer(lineRegisterFile, ";");
                String namePlayer = "", statusGame = "", dateGame = "", timeGame = "";

                while (sT.hasMoreTokens()){
                    namePlayer = sT.nextToken();
                    statusGame = sT.nextToken();
                    dateGame = sT.nextToken();
                    timeGame = sT.nextToken();

                }

                    Game g = new Game(namePlayer,statusGame,dateGame,timeGame);

                    arrayGames[indexArray]=g;

                    indexArray++;

                lineRegisterFile = br.readLine();
            }
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Problemas con el archivo");
        }

     return arrayGames;
    }

    public Game[] bubbleSortArray(Game a[]){ //Ordenamiento burbuja.

        for(int i =0; i<a.length; i++)
            for(int j=i+1; j<a.length; j++)
                if(a[i].getNamePlayer().compareToIgnoreCase(a[j].getNamePlayer())>0){ //Compara ambos nombres.
                    Game temp = a[i]; //Pone los nombres de jugador en un temporal.
                    a[i] = a[j]; //Cambia de lugar en j.
                    a[j] = temp; //Coloca en temp.
                }
        return a;
    }

    public void fileDataSort(Game z[]){ //Ordena los datos en el archivo.

        PrintStream ps = getWriteFile("game.txt",false); //Sobre escribe en el archivo.

        for(int i=0; i<z.length; i++)
            ps.println(z[i].getNamePlayer()+";"+z[i].getStatusGame()+";"+z[i].getDateGame()+";"+z[i].getTimeGame());
    }
}