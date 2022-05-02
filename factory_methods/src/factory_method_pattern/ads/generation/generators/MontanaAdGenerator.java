package factory_method_pattern.ads.generation.generators;

import factory_method_pattern.ads.generation.AdGenerator;
import factory_method_pattern.ads.generation.IRegionalGenerator;
import factory_method_pattern.ads.generation.regions.YellowstoneAds;

public class MontanaAdGenerator extends AdGenerator
{
    @Override
    public IRegionalGenerator getGenerator()
    {
        return new YellowstoneAds();
    }
}
