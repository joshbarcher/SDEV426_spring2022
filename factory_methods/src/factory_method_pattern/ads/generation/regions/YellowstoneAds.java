package factory_method_pattern.ads.generation.regions;

import factory_method_pattern.ads.entities.Advertisement;
import factory_method_pattern.ads.generation.IRegionalGenerator;

import java.util.List;

public class YellowstoneAds implements IRegionalGenerator
{
    @Override
    public List<Advertisement> getAppropriateAds()
    {
        return List.of(
            new Advertisement("Find a hotel near the park!"),
            new Advertisement("Careful on Bison avenue!"),
            new Advertisement("The park stinks, but is fun!")
        );
    }
}
