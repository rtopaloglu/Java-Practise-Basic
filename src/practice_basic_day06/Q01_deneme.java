package practice_basic_day06;

public class Q01_deneme {
    public static void main(String[] args) {

        // int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,14,15,16,17,18};
        // verilen array de once cift olan sayilari, sonra da tek olan sayilari for each loop kullanarak yazdiriniz..

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 15, 16, 17, 18};

        for (int each : arr
        ) {
            if (each % 2 == 0) {
                System.out.print(each + " ");

            }
        }
        System.out.println();

        for (int each : arr
        ) {
            if (each % 2 != 0) {
                System.out.print(each + " ");

            }
        }
    }
}