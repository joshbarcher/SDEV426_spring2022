package strategy.registration;

import entities.Document;
import entities.Runner;

import java.util.Set;
import java.util.stream.Collectors;

//this is a "ConcreteStrategy"
public class FallRegistration implements IRegistration
{
    @Override
    public Set<Runner> filterRunners(Set<Runner> runners)
    {
        Document requiredDoc = new Document("Fall Registration");

        Set<Runner> filtered = runners
            .stream()
            .filter(runner -> runner.getDocuments().contains(requiredDoc))
            .collect(Collectors.toSet());
        return filtered;
    }
}
