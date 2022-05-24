package practice_basic_day06;

import java.time.LocalDate;

public class Q08_deneme {

    // Bugunun tarihi aliniz, yazdiriniz...
    // Daha Sonra 1 gun, 1 Ay ve 1 yil ekleyerek degisen tarihi yazdiriniz..
    // Degisen tarih uzerinden 3 gun, 2 ay ve 5 yil eksilterek son tarihi yaziniz..

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        System.out.println("today = " + today);

        LocalDate changingDate = today.plusYears(1).plusMonths(1).plusDays(1);
        System.out.println("changingDate = " + changingDate);

        LocalDate lastDate = changingDate.minusYears(5).minusMonths(2).minusDays(3);
        System.out.println("lastDate = " + lastDate);

    }
}
