package interviewQuestions3;

import java.util.ArrayList;
import java.util.Arrays;

public class Q05_deneme {
    // Part1:
    // Create an arraylist of Strings
    // add - "Red", "Green", "Blue", "Yellow" and "Black" inside
    // print out all the elements, each element on new line

    // Part2:
    // Create a method that accepts a String arraylist and a String as parameters
    // method should add the element at the first index of arraylist

    // Part3:
    // Create a method that accepts a String arraylist and a String as parameters
    // it should add element before last element
    // ex:  [1, 2, 3]  -> [1, 2, 4, 3]

    public static void main(String[] args) {
        ArrayList<String> renkler = new ArrayList<>();
        renkler.add("Red");
        renkler.add("Green");
        renkler.add("Blue");
        renkler.add("Yellow");
        renkler.add("Black");

        for (int i = 0; i < renkler.size(); i++) {
            System.out.println(renkler.get(i));
        }

        firsIndexOfArrays (renkler, "white");
        System.out.println(renkler);

        lastIndexOfArr (renkler, "pink");
        System.out.println(renkler);


    }

    private static void lastIndexOfArr(ArrayList<String> renkler, String pink) {

        renkler.add(renkler.size() - 1, "pink");
    }

    private static void firsIndexOfArrays(ArrayList<String> renkler, String white) {

        renkler.add(0,white);


    }
}
