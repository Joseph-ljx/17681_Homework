/**
 * @author Joseph Liao The type Square.
 */
public class Square extends Rectangle {
  /** The Side. */
  private double side;

  /**
   * Instantiates a new Square.
   *
   * @param newSide the new side
   */
  public Square(double newSide) {
    super(newSide, newSide);
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
    return this.getSide() * this.getSide();
  }

  @Override
  public double getPerimeter() {
    return this.getSide() * 4;
  }

  @Override
  public String toString() {
    return "Square"
        + " "
        + String.format("%.3f", this.getArea())
        + " "
        + String.format("%.3f", this.getPerimeter());
  }
}
