package visitor_pattern.client;

import visitor_pattern.elements.Applebees;
import visitor_pattern.elements.IElement;
import visitor_pattern.elements.Walmart;
import visitor_pattern.visitors.HealthInspector;
import visitor_pattern.visitors.IHealthInspector;

public class Driver
{
    public static void main(String[] args)
    {
        IElement[] places = new IElement[] {
            new Applebees(true, true),
            new Applebees(false, false),
            new Walmart(100, 100),
            new Walmart(0, 0)
        };

        IHealthInspector inspector = new HealthInspector();
        for (IElement place : places)
        {
            System.out.println(place.accept(inspector));
        }
    }
}
