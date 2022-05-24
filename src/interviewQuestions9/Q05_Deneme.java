package interviewQuestions9;

import java.util.HashMap;

public class Q05_Deneme {
    /*
        Hashmap ile 1 den 6 ya kadar sayilari sayi ve okunusu seklinde yazdirin
    */
    public static void main(String[] args) {
        
        HashMap<Integer, String> map11 = new HashMap<>();
        map11.put(1, "Bir");
        map11.put(2, "Iki");
        map11.put(3, "Uc");
        map11.put(4, "Dort");
        map11.put(5, "Bes");
        map11.put(6, "Alti");

        System.out.println("map11 = " + map11);

    }
}
