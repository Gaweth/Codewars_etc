package sda_java_zaaw;

import com.sun.jdi.Value;

public class reverseIntWithWhile {
    public static void main(String[] args) {
        int num = 123;

        /**
         * jako string builder
         */

//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append(num).reverse().toString();
//        System.out.println(num);
//        System.out.println(stringBuilder);

        /**
         * jako while
         */

        int reverse = 0;
        while (num != 0){
            reverse = reverse * 10;
            reverse = reverse + num % 10;
            num=num/10;
        }
        System.out.println(num);
    }
}
