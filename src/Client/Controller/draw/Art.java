package Client.Controller.draw;

import processing.core.PGraphics;

abstract public interface Art {
  abstract public void draw(PGraphics g);
  abstract public void setPossition(int x,int y);
}
