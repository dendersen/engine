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
  public int[] move(int x, int y){
    this.x += x;
    this.y += y;
    return new int[] {this.x, this.y};
  }
  @Override
  public void draw(PGraphics g) {
    g.image(g, x, y);
  }
  
}
