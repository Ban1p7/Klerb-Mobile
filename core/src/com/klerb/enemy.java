package com.klerb;

import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.*;
import java.util.Random;

public class enemy extends object{
  Random rand;
  public enemy(int initx, int inity, int initWidth, int initHeight, String imageFilePath, int speed){
    super(initx, inity, initWidth, initHeight, imageFilePath);
    xv = -speed;
    rand = new Random();
  }
  public void update(){
    x += xv;
    y += yv;
    if (x + width < 0){
      x += Gdx.graphics.getWidth() * 2;
      y = rand.nextInt(Gdx.graphics.getHeight() - height);
    }
    return;
  }
}
