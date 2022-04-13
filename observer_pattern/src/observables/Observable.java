package observables;

import observers.IObserver;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * This is meant to be the parent class of observable objects
 * (objects that do something that is interesting).
 */
public abstract class Observable
{
    private Set<IObserver> observers;

    public Observable()
    {
        observers = new HashSet<>();
    }

    //track observers
    public void addObserver(IObserver observer)
    {
        //because this is a set, duplicate observers will be ignored
        observers.add(observer);
    }

    public void removeObserver(IObserver observer)
    {
        observers.remove(observer);
    }

    //let observers know that the observable "did something"
    public void notifyObservers()
    {
        //loop over all observers
        for (IObserver observer : observers)
        {
            observer.update();
        }
    }

    public void notifyObservers(Object... args)
    {
        //loop over all observers
        for (IObserver observer : observers)
        {
            observer.update(args);
        }
    }
}










