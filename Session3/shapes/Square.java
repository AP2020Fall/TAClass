package shapes;

public class Square extends Rectangle {

    public Square(double x, double y, double width) {
        super(x, y, width, width, ShapeType.SQUARE);
    }

    @Override
    public double calculateArea() {
        return Math.pow(width, 2);
    }

    @Override
    public double calculatePerimeter() {
        return (width * 4);
    }

    @Override
    public String toString() {
        return "This is a SQUARE!";
    }
}
