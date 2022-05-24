package interviewQuestions9;

import java.util.LinkedHashMap;
import java.util.Map;

public class Q04_Deneme {
    /*
   10, Java
   20, PHP
   2,  Python
   57, C++
   89, C#
   40, Javascript
   Map kullanarak yazınız
    */
    public static void main(String[] args) {

        Map<Integer, String> map1 = new LinkedHashMap<>();
        map1.put(10, "Java");
        map1.put(20, "PHP");
        map1.put(2, "Python");
        map1.put(57, "C++");
        map1.put(89, "C#");
        map1.put(40, "Javascript");

        for (Integer each : map1.keySet()) {
            System.out.println(each + " " + map1.get(each));
        }

    }
}
