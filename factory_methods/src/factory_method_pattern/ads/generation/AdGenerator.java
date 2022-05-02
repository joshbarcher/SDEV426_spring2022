package factory_method_pattern.ads.generation;

import factory_method_pattern.ads.entities.Advertisement;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public abstract class AdGenerator
{
    private Random random = new Random();
    private List<Advertisement> ads;
    
    public AdGenerator()
    {

    }

    /*
        This is the primary mechanic of the "factory method"
        pattern. Let the child class instantiate and provide
        an object we need in this class. This method is
        a FACTORY METHOD!
     */
    public abstract IRegionalGenerator getGenerator();
    
    public Advertisement showAd()
    {
        getAdsIfNotLoaded();
        
        //pick a random advertisement to show
        return ads.get(random.nextInt(ads.size()));
    }
    
    public List<Advertisement> getAllAds()
    {
        getAdsIfNotLoaded();

        //this ensures encapsulation of the list
        return Collections.unmodifiableList(ads);
    }

    private void getAdsIfNotLoaded()
    {
        //lazily initialize our advertisements list
        if (ads == null)
        {
            IRegionalGenerator generator = getGenerator();
            ads = generator.getAppropriateAds();
        }
    }
}

