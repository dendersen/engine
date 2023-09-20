package Client.Controller.draw;

import java.util.function.Function;

import Client.App.Button;
import processing.core.PImage;

public abstract class ButtonSprite extends Sprite{
  Button interaction;
  public ButtonSprite(int x, int y, PImage icon) {
    super(x, y, icon);
    Function<Integer,Void> func = this::OnClick; 
    interaction = new Button(x, y,func);
  }
  private Void OnClick(int ID){onClick(ID);return null;}
  public abstract void onClick(int ID);
}
