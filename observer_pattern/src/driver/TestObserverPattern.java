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

        //elonRocket.notifyObservers();

        //attached them together
        elonRocket.addObserver(james);
        elonRocket.addObserver(clark);

        //make a change, see if the observers notice!
        elonRocket.changeAltitude(2);
        elonRocket.changeAltitude(3);
        elonRocket.changeAltitude(4);
    }
}











