package com.ulh;

import com.ulh.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ProgressBar;



public class JogoMainActivity extends Activity {
	
    private GameView game;
  	private static final int PROGRESS = 0x1;
    private ProgressBar mProgress;
    private int mProgressStatus = 0;
          
    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        game = new GameView(this);        
        setContentView(game);
     }
    protected void onDestroy(){
    	super.onDestroy();
    	game.release();
    }
}
