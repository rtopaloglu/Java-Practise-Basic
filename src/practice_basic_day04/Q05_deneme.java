package practice_basic_day04;

public class Q05_deneme {
    public static void main(String[] args) {

         /*
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
         kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
        */

        // Kendim yaptım..

        int arr[] = {3,6,9,1,2,4,5,7};
        int bolenSayi = 3;
        int sayac = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % bolenSayi == 0) {
                sayac++;
            }
        }
        System.out.println(bolenSayi + "'e bolunebilen " + sayac + " adet sayi vardir");

    }
}
