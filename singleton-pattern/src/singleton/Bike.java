package singleton;

public class Bike
{
    private String model;
    private String type; //mountain, e-bike, ...
    private boolean kickStand;

    //singleton pattern being applied...
    private static Bike instance;

    private Bike(String model, String type, boolean kickStand)
    {
        this.model = model;
        this.type = type;
        this.kickStand = kickStand;
    }

    //access my singleton here...
    public static Bike getInstance()
    {
        //lazy-initialization pattern
        if (instance == null)
        {
            instance = new Bike("Brand", "Mountain", true);
        }

        return instance;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public boolean isKickStand()
    {
        return kickStand;
    }

    public void setKickStand(boolean kickStand)
    {
        this.kickStand = kickStand;
    }

    /*@Override
    public String toString()
    {
        return "Bike{" +
                "model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", kickStand=" + kickStand +
                '}';
    }*/
}
