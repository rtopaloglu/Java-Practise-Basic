package practice_free1;

import java.util.Scanner;

public class Q01_deneme {
    /*
      Problem Tanımı :
      Basit 4 islem yapan bir hesap makinesi kodlayiniz....
      Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinız.
      Kullanicidan iki sayi girmesini isteyiniz.
      Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Yapmak istediginiz islemi seciniz : \nToplama Islemi==> + \nCikarma Islemi==>- " +
                "\nBolme Islemi==>/ \nCarpma Islemi==>*\nIsleminiz : ");
        String islem = scan.next();

        System.out.print("islem icin 1. sayiyi giriniz : ");
        int sayi1 = scan.nextInt();
        System.out.print("islem icin 2. sayiyi giriniz : ");
        int sayi2 = scan.nextInt();

        switch (islem) {
            case "+":
                System.out.println(sayi1 + sayi2);
                break;
            case "-":
                System.out.println(sayi2 + sayi1);
                break;
            case "/":
                System.out.println(sayi1 / sayi2);
                break;
            case "*":
                System.out.println(sayi1 * sayi2);
                break;
        }
    }
}
