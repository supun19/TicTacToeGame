package com.games.tictactoe;

import java.util.Random;

import com.example.test.R;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NewGame extends Activity{
	Button[] buttons = new Button [9];
	Button playAgain;
	TextView display;
	TextView user,com;
	int counter;
	public int[][] computer = new int[3][3];
	public int[][] human = new int[3][3];
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        user = (TextView)findViewById(R.id.userWinLabel);
        com = (TextView)findViewById(R.id.comWinLabel);
        user.setText(" "+ (MainActivity.userWinTimes));
        com.setText(""+ (MainActivity.comWinTimes));
        playAgain=(Button)findViewById(R.id.playAgainButton);
        start();
        playAgain.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				finish();
			}
		});
        
	}
	 @Override
	protected void onPause() {
		super.onPause();
		finish();
	}
	public void start(){
		buttons[0] = (Button)findViewById(R.id.button1);
	    buttons[1] = (Button)findViewById(R.id.button2);
	    buttons[2] = (Button)findViewById(R.id.button3);
	    buttons[3] = (Button)findViewById(R.id.button4);
	    buttons[4] = (Button)findViewById(R.id.button5);
	    buttons[5] = (Button)findViewById(R.id.button6);
	    buttons[6] = (Button)findViewById(R.id.button7);
	    buttons[7] = (Button)findViewById(R.id.button8);
	    buttons[8] = (Button)findViewById(R.id.button9);
	    
	    if(new Random().nextBoolean()){
	    	computerMakeAMove();
	    	clickButton();
	    }
	    else
	    	clickButton();
	    
	}
	
	 public void clickButton(){
	    	String[] values = {"00","01","02","10","11","12","20","21","22"};
	        int[] index = {1,2,3,4,5,6,7,8,9};
	        String str;
	        
	    	for(int i = 0;i < 9;i++){
	    		final int a,b;
	    		final int k = i;
	    		str = values[i];
	    		a = Integer.parseInt(values[i].charAt(0)+"");
	    		b = Integer.parseInt(values[i].charAt(1)+"");
	    		
	    		if(human[a][b] == 0 && computer[a][b] == 0){
	    			buttons[i].setOnClickListener(new View.OnClickListener() {
					
	    				@Override
	    				public void onClick(View arg0) {
	    					buttons[k].setTextColor(Color.parseColor("#ff3030"));
	    					buttons[k].setText("X");
	    					human[a][b] = 1;
	    					computerMakeAMove();
	    				}
	    			});
	    		}
	    	}
	    	
	    }
	    public Dialog win() {
	    	 return new AlertDialog.Builder(NewGame.this)
            .setTitle("Computer won !")
            .setPositiveButton("Try Again !", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int whichButton) {
                	finish();
                    /* User clicked OK so do some stuff */
                }
            })
            .setNegativeButton("Close", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int whichButton) {
                	finish();
                    /* User clicked Cancel so do some stuff */
                }
            })
            .create();
		}
	    public void clickButton(int i){
	    	buttons[i].setTextColor(Color.parseColor("#00688b"));
	    	buttons[i].setText("O");
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
	    public void computerMakeAMove(){
	    	new Thread(){
		        public void run(){
		        	try{
		        		sleep(1000);
		        	}catch(InterruptedException e){
		        		e.printStackTrace();
		        	}
		        		
		        }
		        
			}.start();
	    	if(checkForWin(human)){
	    		user.setText(""+ (++MainActivity.userWinTimes));
	    		new AlertDialog.Builder(NewGame.this)
	            .setTitle("Congradulations! You won!")
	            .setPositiveButton("Try Again !", new DialogInterface.OnClickListener() {
	                public void onClick(DialogInterface dialog, int whichButton) {
	                	finish();
	                    /* User clicked OK so do some stuff */
	                }
	            })
	            .setNegativeButton("Close", new DialogInterface.OnClickListener() {
	                public void onClick(DialogInterface dialog, int whichButton) {
	                	finish();
	                    /* User clicked Cancel so do some stuff */
	                }
	            })
	            .create().show();
	        }
	        else if(gameTied()){
	        	new AlertDialog.Builder(NewGame.this)
	            .setTitle("Game Tied!")
	            .setPositiveButton("Try Again !", new DialogInterface.OnClickListener() {
	                public void onClick(DialogInterface dialog, int whichButton) {
	                	finish();
	                    /* User clicked OK so do some stuff */
	                }
	            })
	            .setNegativeButton("Close", new DialogInterface.OnClickListener() {
	                public void onClick(DialogInterface dialog, int whichButton) {
	                	finish();
	                    /* User clicked Cancel so do some stuff */
	                }
	            })
	            .create().show();
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
	                else if((human[0][1]+human[1][2] == 2) && (human[0][2]+computer[0][2] != 1)){next = 3;}
	                else if((human[1][0]+human[2][1] == 2) && (human[2][0]+human[2][0] != 1)){next = 7;}
	                else if((human[1][2]+human[2][1] == 2) && (human[2][2]+human[2][2] != 1)){next = 9;}
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
	                //Added later to improve an error  
	                else{
	                    for (int i = 0; i < 3; i++) {
	                        int k = 0;
	                        for (int j = 0; j < 3; j++) {
	                            if(human[i][j] == 0 && computer[i][j] == 0){
	                                if(human[i][0] == 1 || human[i][1]  == 1 || human[i][2] == 1)
	                                    continue;
	                                if(human[0][j] == 1 || human[1][j]  == 1 || human[2][j] == 1)
	                                    continue;
	                                str = i + "" + j;
	                                k = 5;
	                                break;
	                            }
	                            if(k == 5)
	                                break;
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
	                clickButton(0);
	                break;
	            case 2:
	                computer[0][1] = 1;
	                clickButton(1);
	                break;
	            case 3:
	                computer[0][2] = 1;
	                clickButton(2);
	                break;
	            case 4:
	                computer[1][0] = 1;
	                clickButton(3);
	                break;
	            case 5:
	                computer[1][1] = 1;
	                clickButton(4);
	                break;
	            case 6:
	                computer[1][2] = 1;
	                clickButton(5);
	                break;
	            case 7:
	                computer[2][0] = 1;
	                clickButton(6);
	                break;
	            case 8:
	                computer[2][1] = 1;
	                clickButton(7);
	                break;
	            case 9:
	                computer[2][2] = 1;
	                clickButton(8);
	                break;
	            default:
	            	new AlertDialog.Builder(NewGame.this)
		            .setTitle("Game Tied!")
		            .setPositiveButton("Try Again !", new DialogInterface.OnClickListener() {
		                public void onClick(DialogInterface dialog, int whichButton) {
		                	finish();
		                    /* User clicked OK so do some stuff */
		                }
		            })
		            .setNegativeButton("Close", new DialogInterface.OnClickListener() {
		                public void onClick(DialogInterface dialog, int whichButton) {
		                	finish();
		                    /* User clicked Cancel so do some stuff */
		                }
		            })
		            .create().show();
	                
	        }
	        
	        if(checkForWin(computer)){
	        	com.setText(" "+ (++MainActivity.comWinTimes));
	        	win().show();;
	        }
	        if((!checkForWin(human) || !checkForWin(computer)) && gameTied()){
	        	new AlertDialog.Builder(NewGame.this)
	            .setTitle("Game Tied!")
	            .setPositiveButton("Try Again !", new DialogInterface.OnClickListener() {
	                public void onClick(DialogInterface dialog, int whichButton) {
	                	finish();
	                    /* User clicked OK so do some stuff */
	                }
	            })
	            .setNegativeButton("Close", new DialogInterface.OnClickListener() {
	                public void onClick(DialogInterface dialog, int whichButton) {
	                	finish();
	                    /* User clicked Cancel so do some stuff */
	                }
	            })
	            .create().show();
	        }
	        }
	    	
	    }
	
}
