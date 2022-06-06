package visitor_pattern.elements;

import visitor_pattern.visitors.IHealthInspector;

public interface IElement
{
    String accept(IHealthInspector inspector);
}
