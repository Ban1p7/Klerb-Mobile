package com.klerb;

import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.*;

public class object{
  double x;
  double y;
  int width;
  int height;
  Texture sprite;
  double xv;
  double yv;
  double gravity;
  public object(int initx, int inity, int initWidth, int initHeight, String imageFilePath){
    x = initx;
    y = inity;
    width = initWidth;
    height = initHeight;
    sprite = new Texture(imageFilePath);
    xv = yv = 0;
//     gravity = 0.25;
    gravity = initWidth/64*5;
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
    return;
  }
  public void render(SpriteBatch batch){
    batch.draw(sprite, (int)x, (int)y, (int)width, (int)height);
    return;
  }
  public boolean isColliding(object collider){
    if (
      x + width < collider.x ||
      y + height < collider.y ||
      collider.x + collider.width < x ||
      collider.y + collider.height < y
    ){
      return false;
    }
    return true;
  }
}
