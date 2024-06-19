package com.klerb;

import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.*;

public class parralaxelement{
  int speed;
  int x;
  Texture texture;
  public parralaxelement(int initspeed, Texture inittexture){
    speed = initspeed;
    texture = inittexture;
  }
  public void update(){
    x += (int)(speed * enemy.getmovemultiplier());
    if (x + Gdx.graphics.getWidth() < 0){
      x += Gdx.graphics.getWidth();
    }
  }
  public void render(SpriteBatch batch){
    batch.draw(texture, x, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
    batch.draw(texture, x + Gdx.graphics.getWidth(), 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
  }
}
