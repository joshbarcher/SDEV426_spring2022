package shapes.specific;

import shapes.basic.Line;
import shapes.basic.ShapeType;

public class Point extends Line
{
    public Point(double x, double y)
    {
        super(x, y, x, y);
        setType(ShapeType.POINT);
    }
}
