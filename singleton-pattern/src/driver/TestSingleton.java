package driver;

import singleton.Bike;

public class TestSingleton
{
    public static void main(String[] args)
    {
        /*Bike first = new Bike("Brand", "Mountain", true);
        Bike second = new Bike("Brand", "E-bike", false);
        Bike third = new Bike("Brand", "Kids", true);

        Bike fourth = new Bike();

        System.out.println(Math.pow(1, 2));*/

        Bike singleton = Bike.getInstance();
        System.out.println(singleton);

        Bike singletonAgain = Bike.getInstance();
        System.out.println(singletonAgain);
    }
}
