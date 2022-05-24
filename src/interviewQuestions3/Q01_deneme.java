package interviewQuestions3;

public class Q01_deneme {
    /*
		// Stringi ters cevirmek icin bir Java Programi yazin
		//1.Yol: StringBuilder () kullanarak
		//2.Yol: String Classini kullanarak
		//3.Yol: Bir method olusturun, ardindan methodu main method dan cagirin
    */
    public static void main(String[] args) {
        //1.Yol: StringBuilder () kullanarak
        String input = "Java cok guzel";

        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append(input);

        //StringBuilder reverseStr = strBuilder.reverse();
        //System.out.println(reverseStr);
        String reverseStr = strBuilder.reverse().toString();
        System.out.println(reverseStr);


        System.out.println();

        //2.Yol: String Classini kullanarak

        for (int i = input.length() - 1; i >= 0; i--) {
            System.out.print(input.charAt(i));
        }
        System.out.println();


        for (int i = input.length() - 1; i >= 0; i--) {
            String terstenStr ="";
            terstenStr += input.charAt(i);
            System.out.print(terstenStr);
        }

        System.out.println();

        //3.Yol: Bir method olusturun, ardindan methodu main method dan cagirin
        reverseInputMthd (input);

    }

    private static void reverseInputMthd(String input) {
        char [] charAry = input.toCharArray();
        for (int i = input.length() - 1; i >= 0; i--) {
            System.out.print(charAry[i]);
        }


    }
}
