package com.klerb;

import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.*;
import com.badlogic.gdx.utils.*;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	player borris;
	inputHandler myInput;
	enemy[] enemies;
	boolean playing = false;
	BitmapFont font;

	@Override
	public void create () {
		batch = new SpriteBatch();
		font = new BitmapFont();
    font.getData().setScale(2);
		borris = new player(32, 0, 64, 64, "klerb.png");
		myInput = new inputHandler();
		Gdx.input.setInputProcessor(myInput);
		enemies = new enemy[4];
		int separation = Gdx.graphics.getWidth() / enemies.length * 2;
		for (int i = 0; i < enemies.length; i++){
		   // enemy(int initx, int inity, int initWidth, int initHeight, String imageFilePath)
		   enemies[i] = new enemy(Gdx.graphics.getWidth() + separation * i, 0, 64, 64, "enemy.png", 5);
		}
	}

	@Override
	public void render () {
	  if (playing == true){
  	  if (inputHandler.touched){
  	    borris.update(-1);
  	    inputHandler.touched = false;
  	  } else {
  	    borris.update(1);
  	  }
  	  for (int i = 0; i < enemies.length; i++){
  	    enemies[i].update();
  	    if (enemies[i].isColliding(borris)){
  	      playing = false;
  	    }
  	  }

  		ScreenUtils.clear(0.2f, 0.2f, 0.2f, 1);
  		batch.begin();
  	  for (int i = 0; i < enemies.length; i++){
  	    enemies[i].render(batch);
  	  }
  		borris.render(batch);
  		batch.end();
		} else {
		  if (inputHandler.touched){
  	    playing = true;
  	    inputHandler.touched = false;
  	  }
  		batch.begin();
		  ScreenUtils.clear(0.2f, 0.2f, 0.2f, 1);
		  font.getData().setScale(2);
		  font.draw(batch, "Klerb", 10, 300);
		  font.getData().setScale(1);
		  font.draw(batch, "Tap or click to start", 10, 250);
		  batch.draw(borris.sprite, 256, 128, 128, 128);
		  batch.end();
		}
	}

	@Override
	public void dispose () {
		batch.dispose();
	}
}
