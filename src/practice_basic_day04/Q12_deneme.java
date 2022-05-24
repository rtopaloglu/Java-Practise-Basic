package practice_basic_day04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q12_deneme {
    public static void main(String[] args) {

        /*
         * Kullanicidan int  list uzunlugunu isteyin
         * Listin uzunlugu kadar kullanicidan list elemanlarini girmesini isteyin
         * Tekrarli list elemanlarindan yeni bir list olusturan ve  yazdiran metod yazin
         *
         * n = 5 icin (listin uzunlugu);
         * input { 1 , 2 , 2 , 3 , 4}
         * output {2}
         *
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen List'in uzunlugunu girin : ");
        int ListUzunluk = scanner.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < ListUzunluk; i++) {
            System.out.print("Listin elemanlarini giriniz : ");
            int sayi = scanner.nextInt();
            list.add(sayi);
        }
        System.out.println("Listin elemanlari : " + list);

        // tekrarli elemanlari bulma
        List<Integer> tekrarliList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {

                if (list.get(i).equals(list.get(j))) {
                    tekrarliList.add(list.get(i));
                }
            }

        }
        System.out.println("Tekrar eden sayilar Listesi :" + tekrarliList);


    }

}

