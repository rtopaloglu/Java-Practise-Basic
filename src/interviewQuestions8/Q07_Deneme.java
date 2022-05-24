package interviewQuestions8;

import java.util.*;

public class Q07_Deneme {
    // create an array of random numbers of size 10
    // convert that array into a list
    // convert list into set

    // 10 boyutunda rasgele sayılardan oluşan bir array oluştur
    // bu arrayi bir listeye dönüştür
    // listeyi sete çevir

    public static void main(String[] args) {

        Integer arr [] = new Integer[10];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10);

        }
        System.out.println("arr = " + Arrays.toString(arr));

        List<Integer> listArr = new ArrayList<Integer>(Arrays.asList(arr));
        System.out.println("listArr = " + listArr);

        Set<Integer> setList = new HashSet<Integer>(listArr);
        System.out.println("setList = " + setList);
    }
}
