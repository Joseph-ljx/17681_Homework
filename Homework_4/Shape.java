/**
 * @author Joseph Liao
 * Shape Class
 */
public abstract class Shape {
    /**
     * The Area.
     */
    private double area;
    /**
     * The Perimeter.
     */
    private double perimeter;

    /**
     * Instantiates a new Shape.
     *
     * @param newArea      the new area
     * @param newPerimeter the new perimeter
     */
    public Shape(double newArea, double newPerimeter) {
        this.area = newArea;
        this.perimeter = newPerimeter;
    }

    /**
     * Get area double.
     *
     * @return the double
     */
    public abstract double getArea();

    /**
     * Sets area.
     *
     * @param area the area
     */
    public void setArea(double area) {
        this.area = area;
    }

    /**
     * Get perimeter double.
     * Get perimeter double.
     *
     * @return the double
     */
    public abstract double getPerimeter();

    /**
     * Sets perimeter.
     *
     * @param perimeter the perimeter
     */
    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public String toString() {
        return "Shape" + " " + String.format("%.3f", this.getArea()) + " " + String.format("%.3f", this.getPerimeter());
    }

}
