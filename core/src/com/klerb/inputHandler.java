package com.klerb;

import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.*;

public class inputHandler implements InputProcessor{
//   private boolean down;
  public static boolean touched = false;
  public boolean keyDown (int keycode) {
      return false;
   }

   public boolean keyUp (int keycode) {
      return false;
   }

   public boolean keyTyped (char character) {
      return false;
   }

  public boolean touchDown (int x, int y, int pointer, int button) {
    return false;
  }
  public boolean touchUp (int x, int y, int pointer, int button) {
    inputHandler.touched = true;
    return false;
  }

   public boolean touchDragged (int x, int y, int pointer) {
      return false;
   }

   public boolean mouseMoved (int x, int y) {
      return false;
   }

   public boolean scrolled (float amountX, float amountY) {
      return false;
   }
   public boolean touchCancelled (int a, int b, int c, int d){
     return false;
   }
}
