package abstract_factory_pattern.animals.factories;

import abstract_factory_pattern.animals.animals.IAnimals;
import abstract_factory_pattern.animals.caretakers.ICaretakers;

public interface IProgramFactory
{
    //define a few factory methods for a "family" of objects
    //in an animal collecting program
    IAnimals getAnimalProvider();
    ICaretakers getCaretakerProvider();
}
