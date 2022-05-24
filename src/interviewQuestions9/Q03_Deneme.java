package interviewQuestions9;

import java.util.LinkedHashMap;
import java.util.Map;

public class Q03_Deneme {
    //aşağıdaki çıktıyı elde ediniz
    // Kiraz 100
    // İncir 200
    // Enginar 150
    // Üzüm 145
    // Nar 250
    public static void main(String[] args) {

        Map<String, Integer> meyvelerMap = new LinkedHashMap<>();
        meyvelerMap.put("Kiraz", 100);
        meyvelerMap.put("Incir", 200);
        meyvelerMap.put("Enginar", 150);
        meyvelerMap.put("Uzum", 145);
        meyvelerMap.put("Nar", 250);

        for (Map.Entry<String, Integer> each : meyvelerMap.entrySet()
             ) {
            System.out.println(each.getKey()+" "+ each.getValue());
        }



    }
}
