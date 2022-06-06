package visitor_pattern.visitors;

import visitor_pattern.elements.Applebees;
import visitor_pattern.elements.Walmart;

public class HealthInspector implements IHealthInspector
{
    @Override
    public String visit(Applebees applebees)
    {
        if (applebees.isClean() && applebees.isStocked())
        {
            return "Applebees passed";
        }
        return "Applebees failed";
    }

    @Override
    public String visit(Walmart walmart)
    {
        if (walmart.getCleanliness() == 100 && walmart.getFreshness() == 100)
        {
            return "Walmart passed";
        }
        return "Walmart failed";
    }
}
