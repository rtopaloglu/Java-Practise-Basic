package interviewQuestions3;

import java.util.Scanner;

public class Q03_deneme {
    //  Kullanicidan toplanmak uzere sayilar isteyin
    // sayi adedi 10'u gecerse veya toplam 500 'u gecerse
    // bu kadar sayi yeter
    // ".. adet sayi girdin, toplami..." yazdirin

    public static void main(String[] args) {
        int toplam = 0;
        int sayac = 0;
        int sayi = 0;
        Scanner scan = new Scanner(System.in);

        while (sayac < 10 && toplam < 500) {
            System.out.println("sayi giriniz :");
            sayi = scan.nextInt();
            toplam += sayi;
            sayac++;
        } if(sayac > 10 || toplam > 500) {
            System.out.println("sinirlari gectiniz");
            System.out.println("girilen sayi adedi : " + sayac + "\nsayilarin toplamı : " + toplam);
        }
    }
}
