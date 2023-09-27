package Client.Controller.objects;

import Client.Point;

/**
 * TriangularCollision
 */
public class TriangleBox implements HitBox {
  Point[] points = new Point[3];
  double area;
  public TriangleBox(Point a, Point b, Point c){
    points[0] = a;
    points[1] = b;
    points[2] = c;
    area = Math.abs((b.x() - a.x()) * (c.y() - a.y()) - (c.x() - a.x()) * (b.y() - a.y()));
  }
  @Override
  public Point[] getCorners() {
    return points.clone();
  }
  @Override
  public Point hit(HitBox other) {
    Point[] corners = other.getCorners();
    for (int i = 0; i < corners.length; i++) {
      double area = 0; 
      area += Math.abs((points[0].x() - corners[i].x()) * (points[1].y() - corners[i].y()) - (points[1].x()-corners[i].x()) * (points[0].y() - corners[i].y()));
      area += Math.abs((points[1].x() - corners[i].x()) * (points[2].y() - corners[i].y()) - (points[2].x()-corners[i].x()) * (points[1].y() - corners[i].y()));
      area += Math.abs((points[2].x() - corners[i].x()) * (points[0].y() - corners[i].y()) - (points[0].x()-corners[i].x()) * (points[2].y() - corners[i].y()));
      if(this.area * 0.99d > area && this.area * 1.01d < area){
        return corners[i];
      }
    }
    return null;
  }
}