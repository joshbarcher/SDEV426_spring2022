package abstract_factory_pattern.animals.factories;

import abstract_factory_pattern.animals.animals.IAnimals;
import abstract_factory_pattern.animals.animals.PokemonAnimals;
import abstract_factory_pattern.animals.caretakers.ICaretakers;
import abstract_factory_pattern.animals.caretakers.PokemonCaretakers;

public class PokemonProgramFactory implements IProgramFactory
{
    @Override
    public IAnimals getAnimalProvider()
    {
        return new PokemonAnimals();
    }

    @Override
    public ICaretakers getCaretakerProvider()
    {
        return new PokemonCaretakers();
    }
}
