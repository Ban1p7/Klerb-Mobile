package com.klerb;

import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.*;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	player borris;
	inputHandler myInput;

	@Override
	public void create () {
		batch = new SpriteBatch();
		borris = new player(0, 0, 64, 64, "klerb.png");
		myInput = new inputHandler();
		Gdx.input.setInputProcessor(myInput);
	}

	@Override
	public void render () {
	  if (inputHandler.touched){
	    borris.update(-1);
	    inputHandler.touched = false;
	  } else {
	    borris.update(1);
	  }

		ScreenUtils.clear(1, 0, 0, 1);
		batch.begin();
		borris.render(batch);
		batch.end();
	}

	@Override
	public void dispose () {
		batch.dispose();
	}
}
