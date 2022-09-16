/**
 * @author Joseph Liao The type Circle.
 */
public class Circle extends Shape {
  /** The Radius. */
  private double radius;

  /**
   * Instantiates a new Circle.
   *
   * @param newRadius the new radius
   */
  public Circle(double newRadius) {
    this.radius = newRadius;
  }

  /**
   * Get radius double.
   *
   * @return the double.
   */
  public double getRadius() {
    return this.radius;
  }

  @Override
  public double getArea() {
    return Math.PI * this.getRadius() * this.getRadius();
  }

  @Override
  public double getPerimeter() {
    return Math.PI * 2 * this.getRadius();
  }

  @Override
  public String toString() {
    return "Circle"
        + " "
        + String.format("%.3f", this.getArea())
        + " "
        + String.format("%.3f", this.getPerimeter());
  }
}
