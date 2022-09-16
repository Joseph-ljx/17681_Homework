/**
 * @author Joseph Liao The type Octangon.
 */
public class Octagon extends Shape {
  /** The Side. */
  private double side;

  /**
   * Instantiates a new Octangon.
   *
   * @param newSide the new side
   */
  public Octagon(double newSide) {
    this.side = newSide;
  }

  /**
   * Get side double.
   *
   * @return the double
   */
  public double getSide() {
    return this.side;
  }

  @Override
  public double getArea() {
    return (2 + 2 * Math.sqrt(2)) * this.getSide() * this.getSide();
  }

  @Override
  public double getPerimeter() {
    return 8 * this.getSide();
  }

  @Override
  public String toString() {
    return "Octagon"
        + " "
        + String.format("%.3f", this.getArea())
        + " "
        + String.format("%.3f", this.getPerimeter());
  }
}
