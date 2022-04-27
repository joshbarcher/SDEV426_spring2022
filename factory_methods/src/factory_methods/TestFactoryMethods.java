package factory_methods;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class TestFactoryMethods
{
    public static void main(String[] args)
    {
        //factory methods in the LocalDate class
        LocalDate date = LocalDate.parse("2021-10-12");
        LocalDate now = LocalDate.now();
        LocalDate yesterday = LocalDate.of(2022, 4, 26);

        //create readonly data structures in Java collections
        List<String> listOfStrings = List.of("hello", "world", "!");
        Map<String, Integer> readonlyMap = Map.of(
            "Josh", 45,
            "Tammy", 30
        );

        for (String string : listOfStrings)
        {
            System.out.println(string);
        }

        //try out your factory methods from Color class here...
        Color myRandomColor = Color.random();
        Color myRandomColor2 = Color.random();
        System.out.println(myRandomColor);
        System.out.println(myRandomColor2);

        Color darkGray = Color.grayscale(50);
        System.out.println(darkGray);
    }
}
