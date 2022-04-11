package strategy.registration;

import entities.Document;
import entities.Runner;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StrictFallRegistration implements IRegistration
{
    @Override
    public Set<Runner> filterRunners(Set<Runner> runners)
    {
        Document requiredDoc = new Document("Fall Registration");
        Document liabilityWaiver = new Document("Liability Waiver");
        List<Document> allDocuments = List.of(requiredDoc, liabilityWaiver);

        Set<Runner> filtered = runners
                .stream()
                .filter(runner -> runner.getDocuments().containsAll(allDocuments))
                .collect(Collectors.toSet());
        return filtered;
    }
}
