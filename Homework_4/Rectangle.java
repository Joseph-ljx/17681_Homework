/**
 * @author Joseph Liao
 * Rectangle Class extends Shape
 */
public class Rectangle extends Shape {
    /**
     * The Height.
     */
    private double height;
    /**
     * The Width.
     */
    private double width;

    /**
     * Instantiates a new Shape.
     *
     * @param newWidth  the new width
     * @param newHeight the new height
     */
    public Rectangle(double newWidth, double newHeight) {
        super(newHeight * newWidth, 2 * (newHeight + newWidth));
        this.width = newWidth;
        this.height = newHeight;
    }

    @Override
    public double getArea() {
        return this.getHeight() * this.getWidth();
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.getHeight() + this.getWidth());
    }

    /**
     * Get height double.
     *
     * @return the double
     */
    public double getHeight() {
        return this.height;
    }

    /**
     * Get width double.
     *
     * @return the double
     */
    public double getWidth() {
        return this.width;
    }


    @Override
    public String toString() {
        return "Rectangle" + " " + String.format("%.3f", this.getArea()) + " " + String.format("%.3f", this.getPerimeter());
    }
}
