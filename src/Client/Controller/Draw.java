package Client.Controller;

import Client.Controller.draw.Art;
import Client.Controller.draw.ArtList;
import processing.core.PApplet;

public class Draw extends PApplet{
  ArtList content = new ArtList();
  @Override
  public void settings(){
    
  }
  @Override
  public void setup(){
    
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
}
