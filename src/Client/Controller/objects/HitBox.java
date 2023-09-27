package Client.Controller.objects;

import Client.Point;

public interface HitBox {
  public boolean hit(HitBox other);
  public Point[] getCorners();
  public HitBox[] split();
}
