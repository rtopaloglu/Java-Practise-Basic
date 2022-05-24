package practice_basic_day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Q010_deneme {
    public static void main(String[] args) {

        /*
         *  Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
         *  Cumle: Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
         */

        String cumle = "Verilen bir cumledeki bosluklar haric character sayisini bulunuz.";

        cumle = cumle.replace(" ", "");
        String[] harf = cumle.split("");
        System.out.println(harf.length);


    }
}

