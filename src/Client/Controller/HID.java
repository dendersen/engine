package Client.Controller;

import processing.core.PApplet;

public class HID {
  private static boolean right, left;
  private static int posX, posY;
  public static void update(PApplet p){
    posX = p.mouseX;
    posY = p.mouseY;
    right = p.mouseButton == PApplet.RIGHT;
    left = p.mouseButton == PApplet.LEFT;
  }
  public static void setRigthClick(boolean state){
    right = state;
  }
  public static void setLeftClick(boolean state){
    right = state;
  }
  public static void setMousePosition(int x, int y){
    posX = x;
    posY = y;
  }
    public static boolean getLeftClick() {
    return left;
  }
  public static boolean getRightClick() {
    return right;
  }
  public static int getMouseX() {
    return posY;
  }
  public static int getMouseY() {
    return posX;
  }
}
