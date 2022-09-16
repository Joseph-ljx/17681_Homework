/**
 * The shape class.
 * @author Joseph Liao.
 */
public abstract class Shape {
  /** The Area. */
  private double area;
  /** The Perimeter. */
  private double perimeter;

  /**
   * Get area double.
   *
   * @return the double
   */
  public abstract double getArea();

  /**
   * Get perimeter double. Get perimeter double.
   *
   * @return the double.
   */
  public abstract double getPerimeter();

  /**
   * Override obejct toString method.
   *
   * @return an string representation of shape.
   */
  public String toString() {
    return "Shape"
        + " "
        + String.format("%.3f", this.getArea())
        + " "
        + String.format("%.3f", this.getPerimeter());
  }
}
