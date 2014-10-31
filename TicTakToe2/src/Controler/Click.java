/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import DBConnection.DBConnection;
import Window.Name;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author SUPUN
 */
public class Click {
    static public int player=1;
    static public int win=0;
    static public int win1=Name.winPlayer1;
    static public int win2=Name.winPlayer2;
    static public int loos1=0;
    static public int loos2=0;
    static public int clicking=0;
     int player1[];
     int player2[];
    public Click(){
        player1=new int[9];
        player2=new int[9];
        
    }
    public void clearData(){
        for (int i = 0; i < 9; i++) {
            player1[i]=0;
            player2[i]=0;
        }
        clicking=0;
    }
    
    public void playerClick(int number){
        if(player==-1){
            player1[number-1]=-1;
        }
        else{
            player2[number-1]=1;
        }
        clicking++;
    }
    public void changePlayer(){
        if(player==-1){
            player=1;
        }
        else{
            player=-1;
        }
    }
    public void checkPlayWin(){
        int sum=0;
        win=0;
        if(player==-1){
            for (int i = 0; i <3; i++) {
                for (int j = 0; j < 3; j++) {
                    sum=sum+player1[(i*3)+j];
                }
                if(sum==-3){
                    JOptionPane.showMessageDialog(null, Name.Play1Name+" win");
                    win=1;
                    
                    win1++;
                    updateDataBase(Name.Play1Name, win1);
                    loos2++;
                    updateloosDataBase(Name.Play2Name, loos2);
                    
                }
               sum=0;
            }
            for (int i = 0; i <3; i++) {
                for (int j = 0; j < 3; j++) {
                    sum=sum+player1[i+(j*3)];
                }
                if(sum==-3){
                    JOptionPane.showMessageDialog(null, Name.Play1Name+" win");
                    win1++;
                    updateDataBase(Name.Play1Name, win1);
                    loos2++;
                    win=1;
                    updateloosDataBase(Name.Play2Name, loos2);
                }
                sum=0;
            }
            sum=player1[0]+player1[4]+player1[8];
            if(sum==-3){
                JOptionPane.showMessageDialog(null,Name.Play1Name+" win");
                win1++;
                updateDataBase(Name.Play1Name, win1);
                win=1;
                loos2++;
                updateloosDataBase(Name.Play2Name, loos2);
            }
            sum=0;
            sum=player1[2]+player1[4]+player1[6];
            if(sum==-3){
                JOptionPane.showMessageDialog(null, Name.Play1Name+" win");
                win1++;
                updateDataBase(Name.Play1Name, win1);
                win=1;
                loos2++;
                updateloosDataBase(Name.Play2Name, loos2);
            }
            sum=0;
        }
        else{
            for (int i = 0; i <3; i++) {
                for (int j = 0; j < 3; j++) {
                    sum=sum+player2[i*3+j];
                }
                if(sum==3){
                    JOptionPane.showMessageDialog(null, Name.Play2Name+" win");
                    win2++;
                    updateDataBase(Name.Play2Name, win2);
                    win=1;
                    loos1++;
                    updateloosDataBase(Name.Play1Name, loos1);
                    
                }
                sum=0;
            }
            for (int i = 0; i <3; i++) {
                for (int j = 0; j < 3; j++) {
                    sum=sum+player2[i+(j*3)];
                }
                if(sum==3){
                    JOptionPane.showMessageDialog(null,Name.Play2Name+" win");
                    win2++;
                    updateDataBase(Name.Play2Name, win2);
                    win=1;
                    loos1++;
                    updateloosDataBase(Name.Play1Name, loos1);
                }
                sum=0;
            }
            sum=player2[0]+player2[4]+player2[8];
            if(sum==3){
                JOptionPane.showMessageDialog(null,Name.Play2Name+" win");
                win2++;
                updateDataBase(Name.Play2Name, win2);
                win=1;
                loos1++;
                updateloosDataBase(Name.Play1Name, loos1);
            }
            sum=0;
            sum=player2[2]+player2[4]+player2[6];
            if(sum==3){
                JOptionPane.showMessageDialog(null,Name.Play2Name+" win");
                win2++;
                updateDataBase(Name.Play2Name, win2);
                win=1;
                loos1++;
                updateloosDataBase(Name.Play1Name, loos1);
            }
            sum=0;
            if(win==1){
                
            }
        }
        if(clicking==9 &&win!=1){
            JOptionPane.showMessageDialog(null, "Try again");
        }
    
    }
    void updateDataBase(String Name,int win){
        String sql ="update Player set Win_Score="+win+ "  where name='"+Name+"';";
        
        try {
            Connection connection = DBConnection.getInstance().getConnection();
            Statement stm = connection.createStatement();
            stm.executeUpdate(sql);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Name.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Name.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    void updateloosDataBase(String Name,int win){
        String sql ="update Player set Loos_Score="+win+ "  where name='"+Name+"';";
        
        try {
            Connection connection = DBConnection.getInstance().getConnection();
            Statement stm = connection.createStatement();
            stm.executeUpdate(sql);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Name.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Name.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
