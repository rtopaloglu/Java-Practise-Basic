package interviewQuestions9;

import java.util.HashMap;
import java.util.Map;

public class Q01_Deneme {
    //5 tane ulke ismi ve nufusunu oluşturuyoruz.(put)
    //5 tane ulke ismi ve nufusunu yazdırıyoruz(country)
    //5 tane ulke ismi yazdırıyoruz. (keyset())
    //5 tane ulke nufusunu yazdırıyoruz. (values())
    //nüfusların toplamını yazdırın.
    //kaç tane 50 milyondan fazla nüfuslu ülke var?
    // ulke ve nufus  lari hem map gibi..hem de ayri ayri yazdirma ?

    public static void main(String[] args) {

        HashMap<String, Integer> ulke = new HashMap<>();
        ulke.put("Almanya", 80);
        ulke.put("Turkiye", 83);
        ulke.put("Amerika", 250);
        ulke.put("Fransa", 65);
        ulke.put("Italya", 50);

        System.out.println("ulkeler : " + ulke);
        System.out.println("ulkeler : " + ulke.keySet());
        System.out.println("nufuslar : " + ulke.values());

        int sayac = 0;
        for (Integer ulkeNufus : ulke.values()
        ) {
            if (ulkeNufus > 50) {
                sayac++;
            }
        }
        System.out.println("ulke nufusu 50 milyon uzeri ulke sayisi : " + sayac);

        int nufusToplam = 0;
        for (Integer each : ulke.values()
        ) {
            nufusToplam+=each;
        }
        System.out.println("Ulkelerin nufuslarinin toplami : "+nufusToplam);

        for (Map.Entry<String,Integer> siralama : ulke.entrySet()
             ) {
            System.out.println(siralama);
        }

        for (String ulkeIsimleri : ulke.keySet()
             ) {
            System.out.println(ulkeIsimleri);
        }

        for (Integer ulkeNufuslari : ulke.values()
             ) {
            System.out.println(ulkeNufuslari);
        }
    }
}
