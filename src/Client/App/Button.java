package Client.App;

import java.util.ArrayList;
import java.util.function.Function;

public class Button {
  int x,y;
  static ArrayList<Button> click = new ArrayList<Button>();
  static int ButtonCount = -1;
  int buttonID;
  Function<Integer,Void> onClick;
  public Button(int x, int y, Function<Integer,Void> action){
    this.x = x;
    this.y = y;
    click.add(this);
    buttonID = ButtonCount++;
    onClick = action;
  }
  public void onClick() {
    onClick.apply(buttonID);
  }
}
