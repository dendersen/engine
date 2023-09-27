package Client.Controller.objects;

import Client.Point;

public class RectangleBox implements HitBox{
  private Point[] corners; 
  private double length;
  public RectangleBox(Point a, Point b){
    length = a.distance(b);
    corners = new Point[]{
      a,
      b,
      new Point(a.x(), b.y()),
      new Point(b.x(), a.y())
    };
  }
  @Override
  public boolean hit(HitBox other) {
    double maxX = Math.max(corners[0].x(), corners[1].x());
    double minX = Math.min(corners[0].x(), corners[1].x());

    double maxY = Math.max(corners[0].y(), corners[1].y());
    double minY = Math.min(corners[0].y(), corners[1].y());
    Point[] corners = other.getCorners();
    for (int i = 0; i < corners.length; i++) {
      for (int j = i+1; j < corners.length; j++) {
        if(corners[i].distance(corners[j]) > length){
          for (HitBox box : other.split()) {
            if(hit(box)){
              return true;
            }
          }
          return false;
        }
      }
    }
    for (int i = 0; i < corners.length; i++) {
      if(corners[i].x() < maxX && corners[i].x() > minX && corners[i].y() < maxY && corners[i].y() > minY){
        return true;
      }
    }
    return false;
  }
  @Override
  public Point[] getCorners() {
    return corners.clone();
  }
  @Override
  public HitBox[] split() {
    Point center = new Point(
      (corners[0].x() + corners[1].x() + corners[2].x() + corners[3].x()) * 1d/4d, 
      (corners[0].y() + corners[1].y() + corners[2].y() + corners[3].y()) * 1d/4d
    );
    return new RectangleBox[]{
      new RectangleBox(corners[0], center),
      new RectangleBox(corners[1], center),
      new RectangleBox(corners[2], center),
      new RectangleBox(corners[3], center)
    };
  }
}
