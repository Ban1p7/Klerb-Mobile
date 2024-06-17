package com.klerb;

import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.*;

public class player{
  private double x;
  private double y;
  private int width;
  private int height;
  private Texture sprite;
  private double xv;
  private double yv;
  private double gravity;
  public player(int initx, int inity, int initWidth, int initHeight, String imageFilePath){
    x = initx;
    y = inity;
    width = initWidth;
    height = initHeight;
    sprite = new Texture(imageFilePath);
    xv = yv = 0;
    gravity = 0.25;
  }
  public double getX(){
    return x;
  }
  public double setX(double newX){
    x = newX;
    return x;
  }
  public double getY(){
    return y;
  }
  public double setY(double newY){
    y = newY;
    return y;
  }
  public void update(double multiplier){
    gravity *= multiplier;

    yv += gravity;

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
  public void render(SpriteBatch batch){
    batch.draw(sprite, (int)x, (int)y, (int)width, (int)height);
    return;
  }
}
