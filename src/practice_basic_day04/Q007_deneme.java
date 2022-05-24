package practice_basic_day04;

public class Q007_deneme {
    public static void main(String[] args) {

        /*
         * {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}} int 2D arrayini  olustur
         *  2D arrayinden min number print et
         */

        int arr[][] = {{1, 2, 3}, {2, 3, 1}, {5, 5, 5}, {2, 1, 3}};

        int minDeger = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < minDeger) {
                    minDeger = arr[i][j];
                }
            }
        }
        System.out.println("arr'nin min degerli elementi : "+minDeger);
    }
}
