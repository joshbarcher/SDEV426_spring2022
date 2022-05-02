package factory_method_pattern.ads.generation;

import factory_method_pattern.ads.entities.Advertisement;

import java.util.List;

public interface IRegionalGenerator
{
    List<Advertisement> getAppropriateAds();
}
