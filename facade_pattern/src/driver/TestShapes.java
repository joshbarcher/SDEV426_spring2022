package driver;

import facade.ShapesFacade;
import shapes.basic.BaseShape;
import shapes.basic.ShapeType;
import subsystems.CreateShapes;

public class TestShapes
{
    public static void main(String[] args)
    {
        ShapesFacade facade = new ShapesFacade();

        BaseShape circle = facade.generateShape(ShapeType.CIRCLE, 2.5);
        BaseShape line = facade.generateShape(ShapeType.LINE, 1, 3, 2, 7);
        BaseShape rectangle = facade.generateShape(ShapeType.RECTANGLE, 10, 20);
        BaseShape point = facade.generateShape(ShapeType.POINT, 0, 0);

        BaseShape[] shapes = {circle, line, rectangle};
        for (BaseShape shape : shapes)
        {
            System.out.println(shape);
        }
    }
}









