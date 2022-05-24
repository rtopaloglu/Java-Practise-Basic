package practice_free1;

public class Q07_deneme {
    /*
		Interview Question
		 Write a Java program to reverse a string. Use for loop and create a method called reverseString
		  */

    public static void main(String[] args) {
        String str = "Java";
        reverseStr(str);
        System.out.println(reverseStr(str));
    }
    private static String reverseStr(String str) {
        String reverse="";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse+=str.charAt(i);
        }
        return reverse;
    }
}
