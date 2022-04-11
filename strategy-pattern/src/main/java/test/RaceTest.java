package test;

import entities.Document;
import entities.Runner;
import race.Race;
import strategy.registration.FallRegistration;
import strategy.registration.StrictFallRegistration;

import java.time.LocalDate;
import java.util.Arrays;

public class RaceTest
{
    public static void main(String[] args)
    {
        //some test runners
        Runner[] runners = {
            new Runner("Stan Williams", Arrays.asList(new Document("Winter Registration"))),
            new Runner("Michelle Smith", Arrays.asList(new Document("Fall Registration"),
                                                       new Document("Liability Waiver"))),
            new Runner("Tyler Patrick", Arrays.asList(new Document("Winter Registration"),
                                                      new Document("Liability Waiver"))),
            new Runner("Jean Davis", Arrays.asList(new Document("Winter Registration"),
                                                   new Document("Liability Waiver"))),
            new Runner("Susie Brown", Arrays.asList(new Document("Fall Registration"))),
            new Runner("Terry Wilson", Arrays.asList(new Document("Fall Registration"),
                                                     new Document("Liability Waiver")))
        };

        /*Race fallRace = new Race("Fall 10k Bonanza", LocalDate.of(2022, 9, 21),
                                 new FallRegistration());*/
        Race fallRace = new Race("Fall 10k Bonanza", LocalDate.of(2022, 9, 21),
                new StrictFallRegistration());
        Arrays
            .stream(runners)
            .forEach(runner -> fallRace.register(runner));
        fallRace.raceDay();
    }
}
