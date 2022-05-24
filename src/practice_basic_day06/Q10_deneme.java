package practice_basic_day06;

import java.util.Scanner;

public class Q10_deneme {

    // istedigimiz kadar sayi girdigimizde
    // toplamlari bize veren bir method yazalim...

    static int sayi = 1;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        while (sayi > 0) {
            System.out.println("Sayi giriniz : ");
            int sayi = scan.nextInt();
            sayiToplama(sayi);

        }

    }

    private static void sayiToplama(int... sayi) {
        int toplam = 0;
        for (int each : sayi
        ) {
            toplam += each;
        }
        System.out.println("sayilarin toplami : " + toplam);

    }
}
