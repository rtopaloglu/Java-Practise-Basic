package interviewQuestions9;

import java.util.Scanner;
import java.util.TreeMap;

public class Q06_Deneme {
    // TreeMap kullanarak bir cümlenin içindeki harflerin frekansını method ile bulunuz.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence : ");
        String sentence = scanner.nextLine();

        frekans(sentence); // first weg


    }

    private static void frekans(String sentence) {
        TreeMap<Character, Integer> frknsMap = new TreeMap<>();
        for (int i = 0; i < sentence.length(); i++) {
            if (frknsMap.containsKey(sentence.charAt(i))) {
                frknsMap.replace(sentence.charAt(i), frknsMap.get(sentence.charAt(i)) + 1);
            } else {
                frknsMap.put(sentence.charAt(i), 1);
            }

        }
        System.out.println(frknsMap);
    }
}
