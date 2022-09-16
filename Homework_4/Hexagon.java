/**
 * @author Joseph Liao
 * The type Hexagon.
 */
public class Hexagon extends Shape {
    /**
     * The Side.
     */
    private double side;

    /**
     * Instantiates a new Hexagon.
     *
     * @param newSide the new side
     */
    public Hexagon(double newSide) {
        super(3 * Math.sqrt(3) * Math.pow(newSide, 2) / 2, 6 * newSide);
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
        return 3 * Math.sqrt(3) * Math.pow(this.getSide(), 2) / 2;
    }

    @Override
    public double getPerimeter() {
        return 6 * this.getSide();
    }

    @Override
    public String toString() {
        return "Hexagon" + " " + String.format("%.3f", this.getArea()) + " " + String.format("%.3f", this.getPerimeter());
    }
}
