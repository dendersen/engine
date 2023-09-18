package Client;

import Client.App.Program;
import Client.Controller.Draw;
import processing.core.PApplet;

public class Start {
  static Draw art;
  static Program game;

  public static void main(String[] args) {
    art = new Draw();
    game = new Program();
    PApplet.runSketch(new String[] {"Draw"},art);
  }
  
  public static Program getGame() {
    return game;
  }
  public static Draw getArt() {
    return art;
  }
}
