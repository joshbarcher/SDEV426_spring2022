package points;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//this is the "target system" and the class has expectations
//of the types of objects it works with
public class Cartesian2DPlane
{
    private List<ICartesian2DPoint> points;

    public Cartesian2DPlane()
    {
        points = new ArrayList<>();
    }

    public void addPoint(ICartesian2DPoint point)
    {
        points.add(point);
    }

    @Override
    public String toString()
    {
        return points.toString();
    }
}
