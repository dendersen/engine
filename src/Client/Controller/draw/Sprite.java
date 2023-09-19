package Client.Controller.draw;

import processing.core.PGraphics;
import processing.core.PImage;

public class Sprite extends Art{
  int x,y;
  PImage icon;
  public Sprite(int x, int y, PImage icon){
    this.x = x;
    this.y = y;
    this.icon = icon;
  }
  @Override
  public void draw(PGraphics g) {
    g.image(g, x, y);
  }
  
}
