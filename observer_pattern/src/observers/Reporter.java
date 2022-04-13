package observers;

import observables.Rocket;

import java.util.Arrays;

public class Reporter implements IObserver
{
    private String fullName;
    private String organization;

    public Reporter(String fullName, String organization)
    {
        this.fullName = fullName;
        this.organization = organization;
    }

    @Override
    public void update()
    {
        System.out.println("Reporter noticed something...");
    }

    @Override
    public void update(Object... args)
    {
        //System.out.println("Reporter noticed: " + Arrays.toString(args));
        Rocket rocket = (Rocket)args[0];
        int miles = Integer.valueOf(args[1].toString());
        System.out.println(fullName + " reported that the " + rocket.getName() +
                " reached " + miles + " miles!");
    }
}
