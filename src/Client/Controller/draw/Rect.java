package Client.Controller.draw;

import processing.core.PApplet;
import processing.core.PGraphics;

public class Rect extends Art{
  int x,y,w,h;
  public Rect(int x, int y, int width, int height){
    this.x = x;
    this.y = y;
    this.w = width;
    this.h = height;
  }
  @Override
  public void draw(PGraphics g) {
    g.rectMode(PApplet.CORNER);
    g.rect(x, y, w, h);
  }
}
