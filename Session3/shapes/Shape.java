package shapes;

public abstract class Shape {

    protected double x;
    protected double y;
    protected ShapeType shapeType;

    public Shape(double x, double y, ShapeType shapeType) {
        setX(x);
        setY(y);
        setShapeType(shapeType);
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setShapeType(ShapeType shapeType) {
        this.shapeType = shapeType;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public ShapeType getShapeType() {
        return shapeType;
    }

    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    @Override
    public String toString() {
        return "This is a shapes.Shape";
    }
}
