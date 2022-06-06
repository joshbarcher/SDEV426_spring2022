package visitor_pattern.visitors;

import visitor_pattern.elements.Applebees;
import visitor_pattern.elements.Walmart;

public interface IHealthInspector
{
    String visit(Applebees applebees);
    String visit(Walmart walmart);
}
