package driver;

import observables.Rocket;
import observers.Reporter;

public class TestObserverPattern
{
    public static void main(String[] args)
    {
        //create Observers and Observables
        Reporter james = new Reporter("James Jonas Jameson", "Daily Bugle");
        Reporter clark = new Reporter("Clark Kent", "Daily Planet");
        Rocket elonRocket = new Rocket("Elon 123", "Orbit");

        elonRocket.notifyObservers();

        //attached them together
        elonRocket.addObserver(james);
        elonRocket.addObserver(clark);

        elonRocket.changeAltitude(2);
    }
}











