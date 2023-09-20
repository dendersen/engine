package Client.Controller.draw;

import Client.Start;
import processing.core.PGraphics;

/**
 * TempMoving
 */
public class TempMoving extends Art{
  int x,y;
  int endx,endy;
  int framesRemaning;
  Art icon;
  Art onRemove;
  /**
   * 
   * @param startX
   * @param startY
   * @param finalX
   * @param finalY
   * @param frames
   * @param icon
   * @param onRemove is added to ArtList and nothing else
   */
  public TempMoving(int startX, int startY, int finalX, int finalY, int frames, Art icon, Art onRemove){
    this.x = startX;
    this.y = startY;
    this.endx = finalX;
    this.endy = finalY;
    this.framesRemaning = frames;
    this.icon = icon;
    this.onRemove = onRemove;
  }
  @Override
  public void draw(PGraphics g) {
    icon.draw(g);
    if(framesRemaning == 0){
      Start.getDraw().removeItem(this);
      Start.getDraw().addItem(onRemove);
    }
    setPossition(
      x + ((endx - x) / framesRemaning),
      y + ((endy - y) / framesRemaning)
    );
    framesRemaning--;
  }
  public void setPossition(int x, int y){
    this.x = x;
    this.y = y;
    icon.setPossition(x, y);
  }
}