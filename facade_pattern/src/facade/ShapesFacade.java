package facade;

import shapes.basic.*;
import shapes.specific.Circle;
import shapes.specific.Point;
import shapes.specific.Square;
import subsystems.ShapeDimensions;

public class ShapesFacade
{
    public BaseShape generateShape(ShapeType type, double param1)
    {
        switch (type)
        {
            case SQUARE:
                return new Square(param1);
            case CIRCLE:
                return new Circle(param1);
        }
        throw new IllegalStateException("No shape found with one parameter");
    }

    public BaseShape generateShape(ShapeType type, double param1, double param2)
    {
        switch (type)
        {
            case RECTANGLE:
                return new Rectangle(param1, param2);
            case POINT:
                return new Point(param1, param2);
            case ELLIPSE:
                return new Ellipse(param1, param2);
        }
        throw new IllegalStateException("No shape found with two parameters");
    }

    public BaseShape generateShape(ShapeType type, double param1, double param2,
                                   double param3, double param4)
    {
        switch (type)
        {
            case LINE:
                return new Line(param1, param2, param3, param4);
        }
        throw new IllegalStateException("No shape found with four parameters");
    }

    /*public double calculateArea(ShapeType type, double param1, double param2)
    {

    }*/

    public double calculateArea(BaseShape shape)
    {
        ShapeDimensions dimensions = new ShapeDimensions();

        switch (shape.getType())
        {
            case LINE:
                return 0; //by definition
            case CIRCLE:
                return dimensions.ellipseArea((Circle)shape);
            case RECTANGLE:
                return dimensions.rectangleArea((Rectangle)shape);
            case POINT:
                return 0; //by definition
            case SQUARE:
                return dimensions.rectangleArea((Square)shape);
            case ELLIPSE:
                return dimensions.ellipseArea((Ellipse)shape);
        }
        throw new IllegalStateException("Shape type not found");
    }
}





