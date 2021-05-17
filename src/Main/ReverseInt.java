package Main;

import java.util.Locale;

public class ReverseInt {
    public static void main(String[] args) {
        int number = 1235;
        int reverse = 0;

        while (number!=0){


             int num = number % 10;

            reverse = reverse * 10 + num;


            number /=10;

        }
        System.out.println(reverse);

        System.out.println(reverseInt(1325));

        System.out.println(stringBuilder("Michał"));
    }

    public static int reverseInt(int n){

        return Integer.parseInt(new StringBuilder().append(n).reverse().toString());
    }

    public static String stringBuilder(String word){
        StringBuilder stringBuilder = new StringBuilder(word.toLowerCase());
        stringBuilder.reverse();
        stringBuilder.deleteCharAt(0);

        System.out.println(stringBuilder);
        return "";
    }
}
