package strategy.registration;

import entities.Runner;

import java.util.Set;

//this is a "ConcreteStrategy"
public class SummerRegistration implements IRegistration
{

    @Override
    public Set<Runner> filterRunners(Set<Runner> runners)
    {
        return null;
    }
}
