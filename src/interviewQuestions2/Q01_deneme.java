package interviewQuestions2;

import java.util.Scanner;

public class Q01_deneme {
    /*  soru1: Check if the integer is an Armstrong numbers to 4 digit numbers(4 digit-> exclusive)
      Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
          (0, 1, 153, 370, 371, 407)
          153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
          370 = 3*3*3 + 7*7*7 + 0*0*0 = 370

        soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının amstrong sayı olup olmadıgını
        gösteren program yazınız */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi giriniz : ");
        int sayi = scanner.nextInt();
        armstrongM(sayi);
        //  answer 2:
        armstrongMethody(sayi);

    }

    private static void armstrongMethody(int sayi) {
        for (int i = 0; i < sayi; i++) {
            armstrongM(i);

        }


    }

    private static void armstrongM(int n) {
        int basamakSayi = 0;
        int kuplerininToplamı = 0;
        int girilenSayi = n;

        while (n > 0) {
            basamakSayi = n % 10;
            kuplerininToplamı += Math.pow(basamakSayi, 3);
            n /= 10;
        }
        if (girilenSayi == kuplerininToplamı) {
            System.out.println(girilenSayi + " is the Armstrong integer");
        } else
            System.out.println(girilenSayi+" This is not a Armstrong integer");


    }
}
