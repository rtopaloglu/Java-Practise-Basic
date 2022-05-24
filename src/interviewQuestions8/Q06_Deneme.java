package interviewQuestions8;

import java.util.*;

public class Q06_Deneme {
    // create a list of numbers 1, 3, 1, 2, 4, 5, 3 --> 2 duplicates
    // count how many duplicates we have
    // find out what are the duplicated values

    // 1, 3, 1, 2, 4, 5, 3 sayılarının bir listesini oluşturun --> 2 kopya
    // kaç tane tekrarli eleman olduğunu sayin
    // yinelenen değerlerin ne olduğunu öğrenin

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, 1, 2, 4, 5, 3));
        int duplicated = 0;
        Set<Integer> tekrarsizListe = new HashSet<>();
        List<Integer> tekrarEdenSayilar = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            boolean ekliMi = tekrarsizListe.add(numbers.get(numbers.get(i)));
            if(!ekliMi){
                duplicated++;
                tekrarEdenSayilar.add(numbers.get(i));
            }

        }
        System.out.println("duplicated = " + duplicated);
        System.out.println("tekrarEdenSayilar = " + tekrarEdenSayilar);

    }
}
