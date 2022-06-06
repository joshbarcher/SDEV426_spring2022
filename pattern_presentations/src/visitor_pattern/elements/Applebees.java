package visitor_pattern.elements;

import visitor_pattern.visitors.IHealthInspector;

public class Applebees implements IElement
{
    private boolean isClean;
    private boolean isStocked;

    public Applebees(boolean isClean, boolean isStocked)
    {
        this.isClean = isClean;
        this.isStocked = isStocked;
    }

    public boolean isClean()
    {
        return isClean;
    }

    public boolean isStocked()
    {
        return isStocked;
    }

    @Override
    public String accept(IHealthInspector inspector)
    {
        return inspector.visit(this);
    }
}
