package factory_method_pattern.ads.generation.generators;

import factory_method_pattern.ads.entities.Advertisement;
import factory_method_pattern.ads.generation.AdGenerator;
import factory_method_pattern.ads.generation.IRegionalGenerator;

import java.util.List;

public class CaliforniaAdGenerator extends AdGenerator
{
    @Override
    public IRegionalGenerator getGenerator()
    {
        return new IRegionalGenerator()
        {
            @Override
            public List<Advertisement> getAppropriateAds()
            {
                return List.of(
                    new Advertisement("Come to disneyland"),
                    new Advertisement("The beaches are polluted, be careful!")
                );
            }
        };
    }
}
