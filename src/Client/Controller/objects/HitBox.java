package Client.Controller.objects;

import Client.Point;

public interface HitBox {
  public Point hit(HitBox other);
  public Point[] getCorners();
}
