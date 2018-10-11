public class Triangle() {
  private Point v1;
  private Point v2;
  private Point v3;

  public Triangle(Point a, Point b, Point c) {
    v1 = a;
    v2 = b;
    v3 = c;
  }

  public Triangle(double a, double b, double c, double d, double e, double f) {
    v1.x = a;
    v1.y = b;
    v2.x = c;
    v2.y = d;
    v3.x = e;
    v3.y = f;
  }

  public double getPerimeter() {
    return v1.distanceTo(v2) + v2.distanceTo(v3) + v3.distanceTo(v1);
  }

  public Point getVertex(int a) {
    if (a==0) {
      return Point(v1);
    } else if (a==1) {
      return Point(v2);
    } else {
      return Point(v3);
    }
  }

  public void setVertex(int a, Point p) {
    if (a==0) {
      v1.x = p.x;
      v1.y = p.y;
    } else if (a==1) {
      v2.x = p.x;
      v2.y = p.y;
    } else {
      v3.x = p.x;
      v3.y = p.y;
    }
  }

  public String toString() {
    return "Triangle: A"+v1+" B"+v2+" C"+v3;
  }
}
