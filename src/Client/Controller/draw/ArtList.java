package Client.Controller.draw;

import java.util.LinkedList;

public class ArtList{
  private LinkedList<Art> list = new LinkedList<Art>();
  public int add(Art item){
    list.add(item);
    return list.size() - 1;
  }
  public void remove(int index){
    list.remove(index);
  }
  public boolean remove(Art item){
    return list.remove(item);
  }
}
