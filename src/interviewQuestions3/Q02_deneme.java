package interviewQuestions3;

import java.util.Scanner;

public class Q02_deneme {
    /*
        Crteate a program checks if a String is PALINDROME or not.
        If a word, phrase, or sequence that reads the same backword as forward then it is called "palindrome",
        For Example : "madam" or "nursesrun" .
        Kuulanıcının girdiği bir  String'in PALINDROME olup olmadığını kontrol eden bir method create ediniz
        polindrome :tersten okunuşu da aynı olan ifadeierdir.
        ornek : Ey edip Adanada pide ye,  Traş niçin şart
         */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir String giriniz : ");
        String str = scan.nextLine();

        StringBuilder strBuilder = new StringBuilder(str);
        String terstenStr = strBuilder.reverse().toString();

        System.out.print("terseten yazilisi : " +terstenStr);
        System.out.println();


        if(terstenStr.equalsIgnoreCase(str)){
            System.out.println("girilen ifade Palindrome dur");
        }else
            System.out.println("girilen ifade Palindrome degildir");

        System.out.println();

        String str1 = "Madam";
        String str1Reverse ="";
        for (int i = str1.length() - 1; i >= 0; i--){
            str1Reverse+= str1.charAt(i);
        }
        System.out.println(str1Reverse);
    }

}
