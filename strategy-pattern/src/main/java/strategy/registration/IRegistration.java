package strategy.registration;

import entities.Runner;

import java.util.Set;

//This is called the "Strategy", which represents a "family of algorithms"
public interface IRegistration
{
    Set<Runner> filterRunners(Set<Runner> runners);
}
