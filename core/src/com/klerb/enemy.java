package com.klerb;

import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.*;
import java.util.Random;

public class enemy extends object{
  Random rand;
  private double movemultiplier = 1;
  public enemy(int initx, int inity, int initWidth, int initHeight, String imageFilePath, int speed){
    super(initx, inity, initWidth, initHeight, imageFilePath);
    xv = -speed;
    rand = new Random();
  }
  public void reset(){
    movemultiplier = 1;
  }
  public void update(){
    x += xv * movemultiplier;
    y += yv * movemultiplier;
    if (x + width < 0){
      x += Gdx.graphics.getWidth() * 2;
      y = rand.nextInt(Gdx.graphics.getHeight() - height);
      movemultiplier *= 1.1;
    }
    return;
  }
  public void randomY(){
    y = rand.nextInt(Gdx.graphics.getHeight() - height);
  }
}
