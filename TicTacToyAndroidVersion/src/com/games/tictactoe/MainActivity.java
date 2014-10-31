package com.games.tictactoe;

import com.example.test.R;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends ActionBarActivity {
	Button newGame,playAgain;
	MediaPlayer music;
	public static int userWinTimes = 0,comWinTimes = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_screen);
        music = MediaPlayer.create(MainActivity.this,R.raw.music);
        music.start();
        
        final Thread game = new Thread(){
	        public void run(){
	        	try{
	        		sleep(4000);
	        		Intent openGame = new Intent("com.games.tictactoe.MENU");
	        		startActivity(openGame);
	        	}catch(Exception e){
	        		e.printStackTrace();
	        	}
	        		
	        }
	        
		};
        game.start();
    }
    //Step 2 OnPause() method
    @Override
	protected void onPause() {
		super.onPause();
		music.release();
		finish();
	}
    
}
