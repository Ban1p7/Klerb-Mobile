package com.klerb;

import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.*;

public class player extends object{
  public player(int initx, int inity, int initWidth, int initHeight, String imageFilePath){
    super(initx, inity, initWidth, initHeight, imageFilePath);
  }
  public void update(double multiplier){
    gravity *= multiplier;

    yv = gravity;

    x += xv;
    y += yv;

    if (x < 0){
      x = 0;
      xv = 0;
    } else if (x + width > Gdx.graphics.getWidth()){
      x = Gdx.graphics.getWidth() - width;
      xv = 0;
    }
    if (y < 0){
      y = 0;
      yv = 0;
    } else if (y + height > Gdx.graphics.getHeight()){
      y = Gdx.graphics.getHeight() - height;
      yv = 0;
    }

    return;

  }
}
