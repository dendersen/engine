package Client.Controller.draw;

import Client.Start;
import processing.core.PGraphics;
import processing.core.PImage;

public class Animation extends Art {
  int x,y;
  PImage[] frames;
  boolean repeating;
  int currentFrame = 0;
  public Animation(int x, int y, PImage[] frames, boolean repeating){
    this.x = x;
    this.y = y;
    this.frames = frames;
    this.repeating = repeating;
  }
  @Override
  public void draw(PGraphics g) {
    g.image(frames[currentFrame],x,y);
    currentFrame++;
    if(currentFrame >= frames.length && repeating){
      currentFrame %= frames.length;
    }else if(currentFrame >= frames.length){
      Start.getDraw().removeItem(this);
    }
  }
  @Override
  public void setPossition(int x, int y) {
    this.x = x;
    this.y = y;
  }
  
}
