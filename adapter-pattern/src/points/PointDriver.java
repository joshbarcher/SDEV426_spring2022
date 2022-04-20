package points;

public class PointDriver
{
    public static void main(String[] args)
    {
        Cartesian2DPlane plane = new Cartesian2DPlane();

        plane.addPoint(new Point2D(3, 2));
        plane.addPoint(new Point2D(1, 1));
        plane.addPoint(new Point2D(0, 0));

        //forcing compatability with my adapter
        plane.addPoint(new PointAdapter(new Point3D(1, 2, 5)));
        plane.addPoint(new PointAdapter(new Point3D(-2, 0, 3)));

        System.out.println(plane);
    }
}
