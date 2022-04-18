package facade;

import shapes.basic.*;
import shapes.specific.Circle;
import shapes.specific.Point;
import shapes.specific.Square;

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
}





