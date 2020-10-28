package shapes;

public class Rectangle extends Shape{

    protected double width;
    protected double height;

    // Default Constructor
    // Several Constructors
    public Rectangle(double x, double y, double width, double length, ShapeType shapeType) {
        super(x, y, shapeType);
        setWidth(width);
        setHeight(length);
    }

    public Rectangle(double x, double y, double width, double length) {
        super(x, y, ShapeType.RECTANGLE);
        setWidth(width);
        setHeight(length);
    }

    private void setWidth(double width) {
        this.width = width;
    }

    private void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    // OVERRIDE --> the same name + the same input parameters
    @Override
    public double calculateArea() {
        return (width * height);
    }

    @Override
    public double calculatePerimeter() {
        return ((width + height) * 2);
    }

    @Override
    public String toString() {
        return "This is a RECTANGLE!";
    }
}
