package visitor_pattern.elements;

import visitor_pattern.visitors.IHealthInspector;

public class Walmart implements IElement
{
    //out of 100
    private int freshness;
    private int cleanliness;

    public Walmart(int freshness, int cleanliness)
    {
        this.freshness = freshness;
        this.cleanliness = cleanliness;
    }

    public int getFreshness()
    {
        return freshness;
    }

    public int getCleanliness()
    {
        return cleanliness;
    }

    @Override
    public String accept(IHealthInspector inspector)
    {
        return inspector.visit(this);
    }
}
