package practice_basic_day04;

public class Q009_deneme {
    public static void main(String[] args) {

        /*
         * Girilen Multidimensional arraydeki cift sayilari toplayan bir method
         * yaziniz
         * INPUT : {{1,3,6},{2,8},{5,7,9,14}}
         *
         * OUTPUT : Arraydeki cift sayilarin toplami : 30
         */

        int arr [][]= {{1,3,6},{2,8},{5,7,9,14}};
        ciftSayilarinToplamı (arr);

    }

    private static void ciftSayilarinToplamı(int[][] arr) {
        int ciftToplamı = 0;
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j <arr[i].length; j++) {
                if(arr[i][j]%2==0){
                    ciftToplamı+=arr[i][j];

                }

            }

        }
        System.out.println("Array'deki cift sayilarin toplamı : "+ciftToplamı);

    }
}
