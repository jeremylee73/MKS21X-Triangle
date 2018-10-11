public class Point() {
  private double x;
  private double y;

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public Point(Point a) {
    this.x = a.x;
    this.y = a.y;
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  public double distanceTo(Point a) {
    return Math.sqrt(Math.pow((a.x - this.x),2) + Math.pow((a.y - this.y), 2));
  }

  public double distance(Point a, Point b) {
    return Math.sqrt(Math.pow((b.x - a.x), 2) + Math.pow((b.y - a.y), 2));
  }

  public String toString() {
    return "(" + x + "," + y + ")";
  }
}
