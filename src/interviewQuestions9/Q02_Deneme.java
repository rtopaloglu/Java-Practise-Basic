package interviewQuestions9;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Q02_Deneme {
    // create a map of zipcodes and Cities, at least 3 entries
    // get the keySet and iterate over it, print the map like below:
    // zipcode1 => city1
    // zipcode2 => city2
    // part 2: print all the keys of the map

    public static void main(String[] args) {

        Map<Integer, String> kodluCity = new HashMap<>();
        kodluCity.put(06, "Ankara");
        kodluCity.put(34, "Istanbul");
        kodluCity.put(54, "Sakarya");
        kodluCity.put(35, "Izmir");
        kodluCity.put(41, "Izmit");

        Set<Integer> keys = kodluCity.keySet();
        System.out.println(keys);

        for (Integer each : keys
             ) {
            System.out.print(" "+each+" --> "+kodluCity.get(each));
        }




    }
}
