/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import DBConnection.DBConnection;
import Game.*;
import Window.ChooseWindow;
import Window.GameWindow;
import Window.MainWindow;
import Window.Name;
import Window.VSComputerWindow;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author SUPUN
 */
public class GameControl {
    private static MainWindow main;
    private static ChooseWindow choose;
    private static GameWindow play;
    private static VSComputerWindow vsCom;
    private static Connection connection;
    private static Name name;
    private static String payer1;
    private static String payer2;
        public GameControl() throws ClassNotFoundException, SQLException{
            CreateGame();
        }
    public void CreateGame() throws ClassNotFoundException, SQLException{
        main=new MainWindow(this);
        choose=new ChooseWindow(this);
        play=new GameWindow(this);
        vsCom=new VSComputerWindow(this);
        connection=DBConnection.getInstance().getConnection();
        name=new Name(this);
    }
    public void showNameWindow(){
        name.setVisible(true);
    }
    public void closeNameWindow(){
        name.setVisible(false);
    }
    public void showMainWindow(){
        main.setVisible(true);
    
    }
    public void closeMainWindow(){
        main.setVisible(false);
    
    }
    public void showChooseWindow(){
        choose.setVisible(true);
    
    }
    public void closeChooseWindow(){
       choose.setVisible(false);
    
    }
    public void showGameWindow(){
        play.setName();
        play.setVisible(true);
    
    }
    public void closeGameWindow(){
        play.setVisible(false);
    
    }
    public void showVSComWindow(){
        vsCom.setVisible(true);
    
    }
    public void closeVSComWindow(){
       vsCom.setVisible(false);
    
    }
    public Connection getConnection(){
        return connection;
    }
    public void setPlayer1Name(String name){
        
        this.payer1=name;
    }
    public void setPlayer2Name(String name){
        this.payer2=name;
        
    }
    public String getPlayer1Name(){
        return payer1;
    }
    public String getPlayer2Name(){
        return payer2;
    }
}
