package Client;

public abstract class Point {
  double x,y;
  public Point(double x, double y){
    this.x = x;
    this.y = y;
  }
  public double x(){
    return x;
  }
  public double y(){
    return y;
  }
}