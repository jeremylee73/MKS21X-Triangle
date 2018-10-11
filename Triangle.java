public class Triangle {
  private Point v1;
  private Point v2;
  private Point v3;

  public Triangle(Point a, Point b, Point c) {
    v1 = a;
    v2 = b;
    v3 = c;
  }

  public Triangle(double a, double b, double c, double d, double e, double f) {
    v1 = new Point(a,b);
    v2 = new Point(c, d);
    v3 = new Point(e,f);
  }

  public double getPerimeter() {
    return v1.distanceTo(v2) + v2.distanceTo(v3) + v3.distanceTo(v1);
  }

  public Point getVertex(int a) {
    if (a==0) return new Point(v1);
    if (a==1) return new Point(v2);
    if (a==2) return new Point(v3);
    return null;
  }

  public void setVertex(int a, Point p) {
    if (a==0) v1 = new Point(p);
    if (a==1) v2 = new Point(p);
    if (a==2) v3 = new Point(p);
  }

  public String toString() {
    return "Triangle: A"+v1+" B"+v2+" C"+v3;
  }
}
