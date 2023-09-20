package Client.Controller;

import Client.Controller.draw.Art;
import Client.Controller.draw.ArtList;
import processing.core.PApplet;
import processing.core.PImage;

public class Draw extends PApplet{
  int width,height;
  private static Draw access;
  public Draw(int screenWidth, int screenHeight){
    width = screenWidth;
    height = screenHeight;
  }
  ArtList content = new ArtList();
  @Override
  public void settings(){
    size(width, height);
  }
  @Override
  public void setup(){
    access = this;
  }
  @Override
  public void draw(){
    for (int i = 0; i < content.size(); i++) {
      content.get(i).draw(g);
    }
  }
  /**
   * add an item to the draw pile
   * @return the index atributed to the item, use this index for fast removal of item at a later time.
   */
  public int addItem(Art item){
    return content.add(item);
  }
  public static PImage loadPImage(String path){
    return access.loadImage(path);
  }
}
