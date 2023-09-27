package Client.Controller.objects;

import Client.Point;

/**
 * TriangularCollision
 */
public class TriangleBox implements HitBox {
  private Point[] points = new Point[3];
  private double area;
  private double maxLength = 0;
  public TriangleBox(Point a, Point b, Point c){
    points[0] = a;
    points[1] = b;
    points[2] = c;
    area = Math.abs((b.x() - a.x()) * (c.y() - a.y()) - (c.x() - a.x()) * (b.y() - a.y()));
    for (int i = 0; i < points.length; i++) {
      for (int j = i+1; j < points.length; j++) {
        if(maxLength < points[i].distance(points[j])){
          maxLength = points[i].distance(points[j]);
        }
      }
    }
  }
  @Override
  public Point[] getCorners() {
    return points.clone();
  }
  @Override
  public boolean hit(HitBox other) {
    Point[] corners = other.getCorners();
    for (int i = 0; i < corners.length; i++) {
      for (int j = i+1; j < corners.length; j++) {
        if(corners[i].distance(corners[j]) > maxLength){
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
      double area = 0; 
      area += Math.abs((points[0].x() - corners[i].x()) * (points[1].y() - corners[i].y()) - (points[1].x()-corners[i].x()) * (points[0].y() - corners[i].y()));
      area += Math.abs((points[1].x() - corners[i].x()) * (points[2].y() - corners[i].y()) - (points[2].x()-corners[i].x()) * (points[1].y() - corners[i].y()));
      area += Math.abs((points[2].x() - corners[i].x()) * (points[0].y() - corners[i].y()) - (points[0].x()-corners[i].x()) * (points[2].y() - corners[i].y()));
      if(this.area * 0.99d > area && this.area * 1.01d < area){
        return true;
      }
    }
    return false;
  }
  @Override
  public HitBox[] split(){
    Point center;
    double x = (points[0].x() + points[1].x() + points[2].x()) * 1d / 3d;
    double y = (points[0].y() + points[1].y() + points[2].y()) * 1d / 3d;
    center = new Point(x,y);
    return new HitBox[] {
      new TriangleBox(center, points[0], points[1]), 
      new TriangleBox(center, points[1], points[2]), 
      new TriangleBox(center, points[0], points[2])
    };
  }
}