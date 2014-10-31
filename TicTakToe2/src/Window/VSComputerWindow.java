/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Window;

import Controler.Click;
import Controler.GameControl;
import static java.lang.System.exit;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author SUPUN
 */
public class VSComputerWindow extends javax.swing.JFrame {

    /**
     * Creates new form TwoPlayerWindow
     */
    private static GameControl control;
    private ImageIcon zero;
    private ImageIcon cross;
    private int userWinTimes = 0,comWinTimes = 0;
    public int[][] computer = new int[3][3];
    public int[][] human = new int[3][3];
    public VSComputerWindow(GameControl control) {
        initComponents();
        zero=new ImageIcon(getClass().getResource("/Imege/Zero.png"));
        cross=new ImageIcon(getClass().getResource("/Imege/cross.png"));
        this.control=control;
        comWinLabel.setText(" "+userWinTimes);
        userWinLabel.setText(""+comWinTimes);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comWinLabel = new javax.swing.JLabel();
        userWinLabel = new javax.swing.JLabel();
        grid1 = new javax.swing.JLabel();
        grid2 = new javax.swing.JLabel();
        grid3 = new javax.swing.JLabel();
        grid4 = new javax.swing.JLabel();
        grid5 = new javax.swing.JLabel();
        grid6 = new javax.swing.JLabel();
        grid7 = new javax.swing.JLabel();
        grid8 = new javax.swing.JLabel();
        grid9 = new javax.swing.JLabel();
        Retry = new javax.swing.JLabel();
        Back = new javax.swing.JLabel();
        Quit = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        main = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(342, 500));
        getContentPane().setLayout(null);

        comWinLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        comWinLabel.setForeground(new java.awt.Color(51, 51, 255));
        comWinLabel.setName(""); // NOI18N
        getContentPane().add(comWinLabel);
        comWinLabel.setBounds(80, 20, 60, 20);

        userWinLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        userWinLabel.setForeground(new java.awt.Color(0, 102, 255));
        getContentPane().add(userWinLabel);
        userWinLabel.setBounds(280, 20, 50, 20);

        grid1.setBackground(new java.awt.Color(48, 10, 10));
        grid1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grid1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grid1MouseClicked(evt);
            }
        });
        getContentPane().add(grid1);
        grid1.setBounds(80, 180, 50, 50);

        grid2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grid2MouseClicked(evt);
            }
        });
        getContentPane().add(grid2);
        grid2.setBounds(150, 180, 50, 50);

        grid3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grid3MouseClicked(evt);
            }
        });
        getContentPane().add(grid3);
        grid3.setBounds(210, 180, 50, 50);

        grid4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grid4MouseClicked(evt);
            }
        });
        getContentPane().add(grid4);
        grid4.setBounds(80, 240, 50, 50);

        grid5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grid5MouseClicked(evt);
            }
        });
        getContentPane().add(grid5);
        grid5.setBounds(144, 244, 50, 50);

        grid6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grid6MouseClicked(evt);
            }
        });
        getContentPane().add(grid6);
        grid6.setBounds(214, 244, 50, 50);

        grid7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grid7MouseClicked(evt);
            }
        });
        getContentPane().add(grid7);
        grid7.setBounds(80, 314, 50, 50);

        grid8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grid8MouseClicked(evt);
            }
        });
        getContentPane().add(grid8);
        grid8.setBounds(144, 310, 50, 50);

        grid9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grid9MouseClicked(evt);
            }
        });
        getContentPane().add(grid9);
        grid9.setBounds(214, 314, 50, 50);

        Retry.setFont(new java.awt.Font("Wide Latin", 1, 24)); // NOI18N
        Retry.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Retry.setText("RETRY");
        Retry.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RetryMouseClicked(evt);
            }
        });
        getContentPane().add(Retry);
        Retry.setBounds(70, 390, 200, 30);

        Back.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        Back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Back.setText("Back");
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
        });
        getContentPane().add(Back);
        Back.setBounds(10, 440, 100, 20);

        Quit.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        Quit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Quit.setText("Quit");
        Quit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                QuitMouseClicked(evt);
            }
        });
        getContentPane().add(Quit);
        Quit.setBounds(250, 440, 90, 20);

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Com");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 20, 55, 20);

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("You");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(220, 20, 45, 20);

        main.setBackground(javax.swing.UIManager.getDefaults().getColor("Label.disabledForeground"));
        main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imege/VSCom.jpg"))); // NOI18N
        main.setText("jLabel1");
        getContentPane().add(main);
        main.setBounds(0, 0, 342, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void grid1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grid1MouseClicked
        if(checkForWin(human)||checkForWin(computer)||gameTied()){
            JOptionPane.showMessageDialog(this, "Game is over.Try Again!");
        }
        else if(isButtonAlreadyClicked(0, 0))
            JOptionPane.showMessageDialog(this, "Square already occupied!");
        else{
            grid1.setIcon(cross);
            human[0][0] = 1;
            computerMakeAMove();
        }
    }//GEN-LAST:event_grid1MouseClicked

    private void grid2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grid2MouseClicked
        if(checkForWin(human)||checkForWin(computer)||gameTied()){
            JOptionPane.showMessageDialog(this, "Game is over.Try Again!");
        }
        else if(isButtonAlreadyClicked(0, 1))
            JOptionPane.showMessageDialog(this, "Square already occupied!");
        else{
            grid2.setIcon(cross);
            human[0][1] = 1;
            computerMakeAMove();
        }
    }//GEN-LAST:event_grid2MouseClicked

    private void grid3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grid3MouseClicked
        if(checkForWin(human)||checkForWin(computer)||gameTied()){
            JOptionPane.showMessageDialog(this, "Game is over.Try Again!");
        }
        else if(isButtonAlreadyClicked(0, 2))
            JOptionPane.showMessageDialog(this, "Square already occupied!");
        else{
            grid3.setIcon(cross);
            human[0][2] = 1;
            computerMakeAMove();
        }
    }//GEN-LAST:event_grid3MouseClicked

    private void grid4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grid4MouseClicked
        if(checkForWin(human)||checkForWin(computer)||gameTied()){
            JOptionPane.showMessageDialog(this, "Game is over.Try Again!");
        }
        else if(isButtonAlreadyClicked(1, 0))
            JOptionPane.showMessageDialog(this, "Square already occupied!");
        else{
            grid4.setIcon(cross);
            human[1][0] = 1;
            computerMakeAMove();
        }
    }//GEN-LAST:event_grid4MouseClicked

    private void grid5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grid5MouseClicked
        if(checkForWin(human)||checkForWin(computer)||gameTied()){
            JOptionPane.showMessageDialog(this, "Game is over.Try Again!");
        }
        else if(isButtonAlreadyClicked(1, 1))
            JOptionPane.showMessageDialog(this, "Square already occupied!");
        else{
            grid5.setIcon(cross);
            human[1][1] = 1;
            computerMakeAMove();
        }
    }//GEN-LAST:event_grid5MouseClicked

    private void grid6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grid6MouseClicked
        if(checkForWin(human)||checkForWin(computer)||gameTied()){
            JOptionPane.showMessageDialog(this, "Game is over.Try Again!");
        }
        else if(isButtonAlreadyClicked(1, 2))
            JOptionPane.showMessageDialog(this, "Square already occupied!");
        else{
            grid6.setIcon(cross);
            human[1][2] = 1;
            computerMakeAMove();
        }
    }//GEN-LAST:event_grid6MouseClicked

    private void grid7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grid7MouseClicked
        if(checkForWin(human)||checkForWin(computer)||gameTied()){
            JOptionPane.showMessageDialog(this, "Game is over.Try Again!");
        }
        else if(isButtonAlreadyClicked(2, 0))
            JOptionPane.showMessageDialog(this, "Square already occupied!");
        else{
            grid7.setIcon(cross);
            human[2][0] = 1;
            computerMakeAMove();
        }
    }//GEN-LAST:event_grid7MouseClicked

    private void grid8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grid8MouseClicked
        if(checkForWin(human)||checkForWin(computer)||gameTied()){
            JOptionPane.showMessageDialog(this, "Game is over.Try Again!");
        }
        else if(isButtonAlreadyClicked(2, 1))
            JOptionPane.showMessageDialog(this, "Square already occupied!");
        else{
            grid8.setIcon(cross);
            human[2][1] = 1;
            computerMakeAMove();
        }
    }//GEN-LAST:event_grid8MouseClicked

    private void grid9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grid9MouseClicked
        if(checkForWin(human)||checkForWin(computer)||gameTied()){
            JOptionPane.showMessageDialog(this, "Game is over.Try Again!");
        }
        else if(isButtonAlreadyClicked(2, 2))
            JOptionPane.showMessageDialog(this, "Square already occupied!");
        else{
            grid9.setIcon(cross);
            human[2][2] = 1;
            computerMakeAMove();
        }
    }//GEN-LAST:event_grid9MouseClicked
    
    public boolean isButtonAlreadyClicked(int a,int b){
        return (human[a][b] == 1 || computer[a][b] == 1);
    }
    
    public boolean isComFirstmove(){
        boolean move = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(computer[i][j] == 1){
                    move = false;
                    break;
                }       
            }
        }
        return move;
    }
    
public boolean gameTied(){
    boolean over = false;
    int filledSqares = 0;
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if(human[i][j] == 1 || computer[i][j] == 1){
                filledSqares++;
            }
        }
    }
    if(filledSqares == 9)
        over = true;
    return over;
}
public boolean checkForWin(int check[][]){
    int a = 0, b = 0;
    boolean win  = false;
    for (int i = 0; i < 3; i++) {
        a = 0;
        b = 0;
        for (int j = 0; j < 3; j++) {
            if(check[i][j] == 1)
                a++;
            if(check[j][i] == 1){
                b++;
            }
        }
        
        if( a == 3 || b == 3)
            win = true;
           
    }
    if(!win)
        win = ((check[0][0] == 1) && (check[1][1] == 1) && (check[2][2]) == 1)
            ||  ((check[0][2] == 1 && check[1][1] == 1 && check[2][0] == 1)); 
    
     return win;
}
public void computerMakeAMove(){
    if(checkForWin(human)){
        userWinTimes++;
        userWinLabel.setText(" "+userWinTimes);
        JOptionPane.showMessageDialog(this, "Congradulations! You win!");
    }
    else if(gameTied()){
        JOptionPane.showMessageDialog(this, "Game tied!");
    }
    
    else{
    Random r = new Random();
    String[] values = {"00","01","02","10","11","12","20","21","22"};
    int[] index = {1,2,3,4,5,6,7,8,9};
    int [] first = {1,3,7,9};
    int next = -1;
    int a = 0;
    String str = "";
    //Computer try to win
    for (int i = 0; i < 3; i++) {
        a = 0;
        //Horizontal Check
        for (int j = 0; j < 3; j++) {
            if(computer[i][j] == 1)
                a++;
        }
        if(a == 2){
            for (int j = 0; j < 3; j++) {
                if(computer[i][j] == 0 && human[i][j] != 1){
                    str = i + "" + j;
                    break;
                }
            }
            for (int k = 0; k < 9; k++) {
                if(str.equals(values[k])){
                    next = index[k];
                    break;
                } 
            }
        }
        //Vertical Check
        if(next == -1){
            a = 0;
            for (int j = 0; j < 3; j++) {
                if(computer[j][i] == 1)
                    a++;
            }
            if(a == 2){
                for (int j = 0; j < 3; j++) {
                    if(human[j][i] != 1 && computer[j][i] == 0){
                        str = j + "" + i;
                        break;
                    }
                }
                for (int k = 0; k < 9; k++) {
                    if(str.equals(values[k])){
                        next = index[k];
                        break;
                    }    
                }
            }
        }
        
    }
    //Diagonal 
    if(next == -1){
        a = 0;
        int b = -1;
        
        for (int i = 0; i < 3; i++) {
            if(computer[i][i] == 1){
                a++;
            }
            else if(human[i][i] != 1)
                b = i;
        }
        if(a == 2 && b != -1){
            if(b == 0)
                next = 1;
            else if(b == 1)
                next = 5;
            else
                next = 9;
        }
        
        a = 0;
        b = -1;
        for (int i = 0; i < 3; i++) {
            if(computer[i][2-i] == 1){
                a++;
            }
            else if(human[i][2-i] != 1)
                b = i;
        }
        if(a == 2 && b != -1){
            if(b == 0)
                next = 3;
            else if(b == 1)
                next = 5;
            else
                next = 7;
        }
    }
       
    //End of computer try to win
    //If com cannot win Stop palyer from winning
    if(next == -1){
    for (int i = 0; i < 3; i++) {
        a = 0;
        //Horizontal Check
        for (int j = 0; j < 3; j++) {
            if(human[i][j] == 1)
                a++;
        }
        if(a == 3){
            JOptionPane.showMessageDialog(this, "Congradulations! You win!");
            userWinTimes++;
            userWinLabel.setText(" "+userWinTimes);
        }
        if(a == 2){
            for (int j = 0; j < 3; j++) {
                if(human[i][j] == 0 && computer[i][j] != 1){
                    str = i + "" + j;
                    break;
                }
            }
            for (int k = 0; k < 9; k++) {
                if(str.equals(values[k])){
                    next = index[k];
                    break;
                } 
            }
        }
        //Vertical Check
        if(next == -1){
            a = 0;
            for (int j = 0; j < 3; j++) {
                if(human[j][i] == 1)
                    a++;
            }
            if(a == 2){
                for (int j = 0; j < 3; j++) {
                    if(human[j][i] == 0 && computer[j][i] != 1){
                        str = j + "" + i;
                        break;
                    }
                }
                for (int k = 0; k < 9; k++) {
                    if(str.equals(values[k])){
                        next = index[k];
                        break;
                    }    
                }
            }
        }
        
    }
    }
    //Diagonal check
    int c = -1;
    if(next == -1){
        a = 0;
        int b = -1;
        
        for (int i = 0; i < 3; i++) {
            if(human[i][i] == 1){
                a++;
            }
            else if(computer[i][i] != 1)
                b = i;
        }
        if(a == 2 && b == -1)
            c = 1;
        if(a == 2 && b != -1){
            if(b == 0)
                next = 1;
            else if(b == 1)
                next = 5;
            else
                next = 9;
        }
        
        a = 0;
        b = -1;
        for (int i = 0; i < 3; i++) {
            if(human[i][2-i] == 1){
                a++;
            }
            else if(computer[i][2-i] != 1)
                b = i;
        }
        if(a == 2 && b == -1)
            c = 1;
        if(a == 2 && b != -1){
            if(b == 0)
                next = 3;
            else if(b == 1)
                next = 5;
            else
                next = 7;
        }
       
    }
      
    if(next == -1){
        if((human[0][1]+human[1][0] == 2) && (human[0][0]+computer[0][0] != 1)){next = 1;}
        else if((human[0][1]+human[1][2] == 2) && (human[0][2]+computer[0][2] == 0)){next = 3;}
        else if((human[1][0]+human[2][1] == 2) && (human[2][0]+computer[2][0] == 0)){next = 7;}
        else if((human[1][2]+human[2][1] == 2) && (human[2][2]+computer[2][2] == 0)){next = 9;}
    }
    //Advanced Move 
    if(next == -1){
        if(human[1][1] == 1 && isComFirstmove())
            next = first[r.nextInt(4)];
        else if(computer[1][1] != 1 && human[1][1] != 1)
            next = 5;
        else if(c == 1){
            c = -1;
            for (int i = 0; i < 3; i+=2) {
                for (int j = 0; j < 3; j+=2) {
                    c++;
                    if(computer[i][j] == 0 && human[i][j] == 0){
                        next = first[c];
                        i = 3;
                        break;
                    }
                }
            }
        }
        
        //Added later to stop an error  
        else{
            for (int i = 0; i < 3; i++) {
                int k = 0;
                for (int j = 0; j < 3; j++) {
                    if(human[i][j] == 0 && computer[i][j] == 0){
                        if(human[i][0] == 1 || human[i][1]  == 1 || human[i][2] == 1)
                            continue;
                        if(human[0][j] == 1 || human[1][j]  == 1 || human[2][j] == 1)
                            continue;
                       
                        if(computer[i][j] != 1 && human[i][j] != 1){
                            str = i + "" + j;
                        }
                        i = 3;
                        break;
                    }
                }
               
            }
            for (int k = 0; k < 9; k++) {
                    if(str.equals(values[k])){
                        next = index[k];
                        break;
                    }    
            }
        }//End of error correction 
           
        if(next == -1){
            for(int i = 0;i < 3;i++){
                for(int j = 0;j < 3;j++){
                    if(computer[i][j] == 0 && human[i][j] == 0){
                        str = i + "" + j;
                        i = 3;
                        break;
	            }
	        }
	    }
	    for (int k = 0; k < 9; k++) {
                if(str.equals(values[k])){
                    next = index[k];
                    break;
                }    
	    }
       }        
    }
       
    switch (next) {
        case 1:
            computer[0][0] = 1;
            grid1.setIcon(zero);
            break;
        case 2:
            computer[0][1] = 1;
            grid2.setIcon(zero);
            break;
        case 3:
            computer[0][2] = 1;
            grid3.setIcon(zero);
            break;
        case 4:
            computer[1][0] = 1;
            grid4.setIcon(zero);
            break;
        case 5:
            computer[1][1] = 1;
            grid5.setIcon(zero);
            break;
        case 6:
            computer[1][2] = 1;
            grid6.setIcon(zero);
            break;
        case 7:
            computer[2][0] = 1;
            grid7.setIcon(zero);
            break;
        case 8:
            computer[2][1] = 1;
            grid8.setIcon(zero);
            break;
        case 9:
            computer[2][2] = 1;
            grid9.setIcon(zero);
            break;
        default:
            JOptionPane.showMessageDialog(this, "Try Again!");
    }
    if(checkForWin(computer)){
        comWinTimes++;
        comWinLabel.setText(""+comWinTimes);
        JOptionPane.showMessageDialog(this, "Computer wins!");
    }
    if((!checkForWin(human) || !checkForWin(computer)) && gameTied()){
        JOptionPane.showMessageDialog(this, "Game tied!");
    }
}
      
}
    private void RetryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RetryMouseClicked
        disableImage();
        computer = new int[3][3];
        human = new int[3][3];
        if(new Random().nextBoolean()){
            computerMakeAMove();
        }
    }//GEN-LAST:event_RetryMouseClicked

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        // TODO add your handling code here:
        control.showChooseWindow();
        control.closeGameWindow();
    }//GEN-LAST:event_BackMouseClicked

    private void QuitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuitMouseClicked
        // TODO add your handling code here:
        exit(0);
    }//GEN-LAST:event_QuitMouseClicked
    public void disableImage(){
        grid1.setIcon(null);
        grid2.setIcon(null);
        grid3.setIcon(null);
        grid4.setIcon(null);
        grid5.setIcon(null);
        grid6.setIcon(null);
        grid7.setIcon(null);
        grid8.setIcon(null);
        grid9.setIcon(null);
    }
   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VSComputerWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VSComputerWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VSComputerWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VSComputerWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VSComputerWindow(control).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back;
    private javax.swing.JLabel Quit;
    private javax.swing.JLabel Retry;
    private javax.swing.JLabel comWinLabel;
    private javax.swing.JLabel grid1;
    private javax.swing.JLabel grid2;
    private javax.swing.JLabel grid3;
    private javax.swing.JLabel grid4;
    private javax.swing.JLabel grid5;
    private javax.swing.JLabel grid6;
    private javax.swing.JLabel grid7;
    private javax.swing.JLabel grid8;
    private javax.swing.JLabel grid9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel main;
    private javax.swing.JLabel userWinLabel;
    // End of variables declaration//GEN-END:variables
}
