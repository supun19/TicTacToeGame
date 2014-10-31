/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import Controler.GameControl;
import java.sql.SQLException;



/**
 *
 * @author SUPUN
 */
public class Game {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        GameControl gameControl=new GameControl();
        gameControl.showMainWindow();
    }
    
}
