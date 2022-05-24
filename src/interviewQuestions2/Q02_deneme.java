package interviewQuestions2;

import java.util.Scanner;

import static java.lang.Integer.valueOf;

public class Q02_deneme {
    /*
    Armstrong sayi:herhangi bir sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
        (0, 1, 153, 370, 371, 407, 1634)
        153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
        370 = 3*3*3 + 7*7*7 + 0*0*0 = 370
        1634 = 1*1*1*1 + 6*6*6*6 + 3*3*3*3 + 4*4*4*4 = 1634

        5 basamakli : 54748 */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        String strNumber = scanner.next();

        armstrongMethod2(strNumber);


    }

    private static void armstrongMethod2(String strNumber) {
        String basamak [] = strNumber.split("");
        int sum = 0;
        for (int i = 0; i < basamak.length;i++){
            sum+= Math.pow(Integer.valueOf(basamak[i]), basamak.length);

        }
        if(Integer.valueOf(strNumber)==sum){
            System.out.println(strNumber+ " is a Armstrong Integer");
        }else
            System.out.println(strNumber+ " is not a Armstrong Integer");
    }
}
