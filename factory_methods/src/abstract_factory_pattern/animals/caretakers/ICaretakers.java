package abstract_factory_pattern.animals.caretakers;

import abstract_factory_pattern.animals.entities.Caretaker;

import java.util.Map;

public interface ICaretakers
{
    Map<String, Caretaker> getAllCharacters();
    Caretaker getCharacterByName(String fullName);
}

