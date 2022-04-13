package observers;

public interface IObserver
{
    void update(); //something happened!
    void update(Object... args); //something happened, look at the arguments!
}
