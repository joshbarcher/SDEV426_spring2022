package factory_method_pattern.ads.generation.regions;

import factory_method_pattern.ads.entities.Advertisement;
import factory_method_pattern.ads.generation.IRegionalGenerator;

import java.util.List;

//An instance of this class is provided by the child class of AdGenerator
public class FloridaAds implements IRegionalGenerator
{
    @Override
    public List<Advertisement> getAppropriateAds()
    {
        //disney world, politics, oranges, sunshine, gators, bugs
        return List.of(
            new Advertisement("Come hang out with the Mouse!"),
            new Advertisement("The sunshine state!"),
            new Advertisement("Come visit Hogwarts at Universal Studios!"),
            new Advertisement("Our beaches are beautiful!")
        );
    }
}
