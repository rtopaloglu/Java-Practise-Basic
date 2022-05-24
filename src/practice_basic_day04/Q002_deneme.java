package practice_basic_day04;

public class Q002_deneme {
    public static void main(String[] args) {
        /*
         * write a java program that calculates the average value of array elements
         * Print elements that are greater than avarage
         * (dizi elemanlarinin ortalama degerini hesaplayan ve
         * lari yazdıran bir java programi yazin)
         * input[]= {1,2,3,4,5,6,7}
         * Output : 4
         */

        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int ortalamaDeger=0;
        int toplam = 0;
        int sayac=0;

        for (int i = 0; i <arr.length; i++) {
            toplam +=i;
            System.out.println(toplam);

        }
        System.out.println("sayilarin toplamı :"+toplam);
        ortalamaDeger= toplam/arr.length;
        System.out.println("sayilarin ortalaması :"+ortalamaDeger);

        for (int i = 0; i <arr.length; i++) {
            if(arr[i]>ortalamaDeger){
                sayac++;
            }

        }
        System.out.println("ortalamanın uzerinde "+sayac+" adet sayi vardir");

    }
}
