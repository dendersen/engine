package Client.Controller.draw;

import processing.core.PApplet;
import processing.core.PGraphics;

public class Rect extends Art{
  int x,y,w,h;
  int r,g,b;
  public Rect(int x, int y, int width, int height, int r, int g, int b){
    this.x = x;
    this.y = y;
    this.w = width;
    this.h = height;
    this.r = r;
    this.g = g;
    this.b = b;
  }
  @Override
  public void draw(PGraphics g) {
    g.rectMode(PApplet.CORNER);
    g.fill(this.r, this.g, this.b);
    g.stroke(this.r, this.g, this.b);
    g.rect(this.x, this.y, this.w, this.h);
  }
}
