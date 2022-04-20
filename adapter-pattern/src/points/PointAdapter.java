package points;

//this class will add compatibility with Point3D objects
public class PointAdapter implements ICartesian2DPoint
{
    //store the "adaptee" internally in the adapter
    private Point3D adaptee;

    public PointAdapter(Point3D adaptee)
    {
        this.adaptee = adaptee;
    }

    @Override
    public double getX()
    {
        return adaptee.getX();
    }

    @Override
    public double getY()
    {
        return adaptee.getY();
    }

    @Override
    public String toString()
    {
        return "(" + adaptee.getX() + ", " + adaptee.getY() + ')';
    }
}
