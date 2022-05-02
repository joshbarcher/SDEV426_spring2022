package abstract_factory_pattern.animals.factories;

import abstract_factory_pattern.animals.animals.IAnimals;
import abstract_factory_pattern.animals.animals.ZooAnimals;
import abstract_factory_pattern.animals.caretakers.ICaretakers;
import abstract_factory_pattern.animals.caretakers.ZooCaretakers;

public class ZooProgramFactory implements IProgramFactory
{
    @Override
    public IAnimals getAnimalProvider()
    {
        return new ZooAnimals();
    }

    @Override
    public ICaretakers getCaretakerProvider()
    {
        return new ZooCaretakers();
    }
}
