package practice_basic_day04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q11_deneme {
    public static void main(String[] args) {

        /*  Rastgele kullanici adi olusturan JAVA kodu yaziniz.
         *  1. Kullanicidan ismini isteyelim
         *  2. Kullanici adindaki bosluklari silelim.
         *  3. Kullanici adinin alinabilir olup olmadigina bakalim.
         *  4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
         *  5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.

         */

        // 1. adim
        Scanner scan = new Scanner(System.in);
        System.out.println("Kullanmak istediginiz username giriniz : ");

        // 2. adim

        String username = scan.nextLine().trim();

        List<String>veriTabanindakiKullanicilar = new ArrayList<>();
        veriTabanindakiKullanicilar.add("Ayse");
        veriTabanindakiKullanicilar.add("Ahmet");
        veriTabanindakiKullanicilar.add("Hasan");
        veriTabanindakiKullanicilar.add("Ali");
        veriTabanindakiKullanicilar.add("Mehmet");
        veriTabanindakiKullanicilar.add("Derya");

        // 3. adim

        boolean kullaniciAdiVarMi = veriTabanindakiKullanicilar.contains(username);

        // 4. adim

        if(kullaniciAdiVarMi){
            System.out.println("bu isim zaten kullanilmis");
        }else
            System.out.println("bu ismi kullanabilirsiniz");



    }
}
