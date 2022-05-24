package practice_free1;

public class Q03_deneme {
    /*   Interview Question
        0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız.
   */
    public static void main(String[] args) {

        for (int i = 0; i < 256; i++) {
            char c = (char)i;
            System.out.println(i+"==>"+c);

        }

    }
}
