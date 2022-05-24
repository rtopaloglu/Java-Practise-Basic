package practice_free1;

import java.util.Scanner;

public class Q04_deneme {
    /*
    cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
     */
    public static void main(String[] args) {

        donusum();
    }

    private static void donusum() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Cm olarak bir sayi giriniz : ");
        double sayi = scanner.nextDouble();

        double sayiMetre = sayi/100;
        double sayiKm = sayi/100000;

        System.out.println(sayi+" ==>  "+ sayiMetre+" metre, "+ sayiKm+ "kilometre");

    }
}

