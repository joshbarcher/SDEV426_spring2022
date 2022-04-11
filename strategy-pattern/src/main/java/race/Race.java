package race;

import entities.Runner;
import lombok.Data;
import strategy.registration.FallRegistration;
import strategy.registration.IRegistration;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

@Data
public class Race
{
    private String name;
    private LocalDate dayOfRace;
    private Set<Runner> runners = new HashSet<>();
    private IRegistration registration;

    public Race(String name, LocalDate dayOfRace,
                IRegistration registration)
    {
        this.name = name;
        this.dayOfRace = dayOfRace;
        this.registration = registration;
    }

    public void register(Runner runner)
    {
        runners.add(runner);
    }

    public void raceDay()
    {
        //filter out runners who do not have the right papers...
        runners = registration.filterRunners(runners);

        System.out.println("Runners: ");
        runners.stream().forEach(runner -> System.out.println(runner.getName()));
        System.out.println();

        System.out.println("Race begins!");
        Runner winner = waitForWinner();
        System.out.println("The winner is: " + winner.getName());
    }

    public Runner waitForWinner()
    {
        //pick a random winner
        Random random = new Random();
        Runner winner = runners
            .stream()
            .skip(random.nextInt(runners.size()))
            .findFirst()
            .get();

        //return the winner
        return winner;
    }

    //we are using the strategy pattern which scales better
    //then this type of method declaration...
    /*public void validateFallRace()
    {
        //do something...
    }

    public void validateSummerRace()
    {
        //do something...
    }*/
}

