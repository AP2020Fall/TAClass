package shapes;

public class Circle extends Shape {

    private double radius;

    public Circle(double x, double y, double radius) {
        super(x, y, ShapeType.CIRCLE);
        setRadius(radius);
    }

    private void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double calculateArea() {
        return  Math.PI * (Math.pow(radius, 2));
    }

    @Override
    public double calculatePerimeter() {
        return Math.PI * (2 * radius);
    }

    @Override
    public String toString() {
        return "This is a CIRCLE!";
    }
}
