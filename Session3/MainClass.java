import shapes.Circle;
import shapes.Rectangle;
import shapes.Shape;
import shapes.Square;

import java.util.ArrayList;

public class MainClass {

    public static void main(String[] args) {

        // UP CASTING
        ArrayList<Shape> allShapes = new ArrayList<>();

        allShapes.add(new Circle(0, 0, 3));              // shapes.Circle
        allShapes.add(new Circle(0, 4, 5));              // shapes.Circle
        allShapes.add(new Rectangle(7, 8, 4, 5)); // shapes.Rectangle
        allShapes.add(new Circle(4, -3, 10));            // shapes.Circle
        allShapes.add(new Rectangle(5, -4, 9, 10));//shapes.Rectangle

        // ToString()
        System.out.println("// ToString");
        for (Shape shape : allShapes) {
            System.out.println(shape);
        }
        System.out.println("\n");


        // Perimeter & Area
        System.out.println("// Perimeter & Area");
        for (Shape shape : allShapes) {
            System.out.println(shape.getShapeType() + ": ");
            System.out.println("    Perimeter = " + shape.calculatePerimeter());
            System.out.println("    Area = " + shape.calculateArea());
        }
        System.out.println("\n");


        // & shapes.Square
        System.out.println("// & shapes.Square");
        allShapes.add(new Square(-3, -3, 5));            // shapes.Square
        allShapes.add(new Circle(-6, 0, 6));            // shapes.Circle
        allShapes.add(new Rectangle(7, 5, 6, 8));// shapes.Rectangle
        allShapes.add(new Square(5, 4, 7));             // shapes.Square

        for (Shape shape : allShapes) {
            System.out.println(shape);
        }
        System.out.println("\n");


        // DOWN CASTING
        System.out.println("// DOWN CASTING");
        for (Shape shape : allShapes) {
            if(shape instanceof Circle) {
                Circle c = (Circle) shape;
                System.out.println("This is a shapes.Circle with radius: " + c.getRadius());
            }

            if(shape instanceof Rectangle) {
                Rectangle r = (Rectangle) shape;
                System.out.println("This is a shapes.Rectangle with width: " + r.getWidth() + " & height: " + r.getHeight());
            }

            if(shape instanceof Square) {
                Square s = (Square) shape;
                System.out.println("This is a shapes.Square with width: " + s.getWidth());
            }
        }
        System.out.println("\n");
    }
}
