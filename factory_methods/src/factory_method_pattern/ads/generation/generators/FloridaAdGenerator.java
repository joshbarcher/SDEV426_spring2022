package factory_method_pattern.ads.generation.generators;

import factory_method_pattern.ads.generation.AdGenerator;
import factory_method_pattern.ads.generation.IRegionalGenerator;
import factory_method_pattern.ads.generation.regions.FloridaAds;

public class FloridaAdGenerator extends AdGenerator
{
    //this is a factory method that will be used in the AdGenerator class!
    @Override
    public IRegionalGenerator getGenerator()
    {
        return new FloridaAds();
    }
}
