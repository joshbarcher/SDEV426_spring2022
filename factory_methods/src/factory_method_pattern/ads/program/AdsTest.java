package factory_method_pattern.ads.program;

import factory_method_pattern.ads.entities.Advertisement;
import factory_method_pattern.ads.generation.AdGenerator;
import factory_method_pattern.ads.generation.IRegionalGenerator;
import factory_method_pattern.ads.generation.generators.CaliforniaAdGenerator;
import factory_method_pattern.ads.generation.generators.FloridaAdGenerator;
import factory_method_pattern.ads.generation.generators.MontanaAdGenerator;

import java.util.List;

public class AdsTest
{
    public static void main(String[] args)
    {
        AdGenerator generator = new CaliforniaAdGenerator();

        for (int i = 1; i <= 5; i++)
        {
            System.out.println(generator.showAd());
        }
    }
}



