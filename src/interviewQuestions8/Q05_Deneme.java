package interviewQuestions8;

public class Q05_Deneme {
    // create a method that accepts an int
    // and returns twice of that int
    // overload this method with wrapper class: Integer

    // int kabul eden bir metot yarat
    // ve bu int'nin iki katını döndürür
    // bu yöntemi wrapper sınıfıyla overload et : Integer

    public static void main(String[] args) {

        twice (5);
        System.out.println(twice(5));

        Integer sayi = 10;
        twice(sayi);
        System.out.println(twice(sayi));

    }

    private static int twice(int sayi) {
        return sayi*2;
    }

    private static Integer twice(Integer sayi) {
        return sayi*2;
    }
}
