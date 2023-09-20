package Client.Controller.draw;

import Client.Controller.Draw;
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
  public Sprite(int x, int y, String path){
    this.x = x;
    this.y = y;
    this.icon = Draw.loadPImage(path);
  }
  public int[] move(int x, int y){
    this.x += x;
    this.y += y;
    return new int[] {this.x, this.y};
  }
  @Override
  public void draw(PGraphics g) {
    g.image(icon, x, y);
  }
  
}
