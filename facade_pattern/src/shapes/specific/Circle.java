package shapes.specific;

import shapes.basic.Ellipse;
import shapes.basic.ShapeType;

public class Circle extends Ellipse
{
    public Circle(double radius)
    {
        super(radius, radius);
        setType(ShapeType.CIRCLE);
    }
}
