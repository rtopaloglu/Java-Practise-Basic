package practice_basic_day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q003_deneme {
    public static void main(String[] args) {

        /*  you have a string "HeySiri"
         * with arrays change it to "ByeSiri" and write changing array
         *(String iniz: "HeySiri"  Diziyi "ByeSiri" ye cevirin )
         *
         */

        String str = "HeySiri";
        String str2 = str.replaceAll("Hey", "Bye");

        String[] arr = new String[1];
        arr[0] = str2;
        System.out.println(Arrays.toString(arr));

    }
}
