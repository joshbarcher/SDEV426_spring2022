package shapes.specific;

import shapes.basic.Rectangle;
import shapes.basic.ShapeType;

public class Square extends Rectangle
{
    public Square(double side)
    {
        super(side, side);
        setType(ShapeType.SQUARE);
    }
}
