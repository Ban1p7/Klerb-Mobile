package com.klerb;

import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.*;
import com.badlogic.gdx.utils.*;
import com.badlogic.gdx.audio.*;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	player borris;
	inputHandler myInput;
	enemy[] enemies;
	boolean playing = false;
	BitmapFont font;
	Texture title_screen;
	int title_screen_x;
	int title_screen_y;
	int separation;
	Music menu_music;
	Music game_music;

	@Override
	public void create () {
		batch = new SpriteBatch();
		font = new BitmapFont();
    font.getData().setScale(2);
    int width = (int)(Gdx.graphics.getHeight() / 7);
    title_screen = new Texture("title_screen.png");
    title_screen_x = (int)(Gdx.graphics.getWidth() / 2 - 640 / 2);
    title_screen_y = (int)(Gdx.graphics.getHeight() / 2 - 480 / 2);
		borris = new player(width/2, 0, width, width, "klerb.png");
		myInput = new inputHandler();
		Gdx.input.setInputProcessor(myInput);
		enemies = new enemy[4];
		separation = Gdx.graphics.getWidth() / enemies.length * 2;
		for (int i = 0; i < enemies.length; i++){
		   // enemy(int initx, int inity, int initWidth, int initHeight, String imageFilePath)
		   enemies[i] = new enemy(separation * i, 0, width, width, "enemy.png", Gdx.graphics.getWidth() / 640 * 5);
		}
		menu_music = Gdx.audio.newMusic(Gdx.files.internal("klerb_theme.mp3"));
		game_music = Gdx.audio.newMusic(Gdx.files.internal("notmyassets/background-music.mp3"));
	}

	@Override
	public void render () {
	  if (playing == true){
	    if (game_music.isPlaying() == false){
  		  menu_music.stop();
  		  game_music.play();
  		  game_music.setLooping(true);
		  }
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
		  if (menu_music.isPlaying() == false){
  		  game_music.stop();
  		  menu_music.play();
  		  menu_music.setLooping(true);
		  }
		  if (inputHandler.touched){
        for (int i = 0; i < enemies.length; i++){
          enemies[i].x = separation * i;
          enemies[i].x += Gdx.graphics.getWidth() * 2;
          enemies[i].randomY();
          enemies[i].reset();
		    }
  	    playing = true;
  	    inputHandler.touched = false;
  	  }
  		batch.begin();
		  ScreenUtils.clear(0.2f, 0.2f, 0.2f, 1);
// 		  font.getData().setScale(2);
// 		  font.draw(batch, "Klerb", 10, 300);
// 		  font.getData().setScale(1);
// 		  font.draw(batch, "Tap or click to start", 10, 250);
// 		  batch.draw(borris.sprite, 256, 128, 128, 128);
      batch.draw(title_screen, title_screen_x, title_screen_y, 640, 480);
		  batch.end();
		}
	}

	@Override
	public void dispose () {
		batch.dispose();
	}
}
