package Main;

import java.lang.reflect.Array;
import java.util.Arrays;

public class avg {
    public static void main(String[] args) {
        System.out.println(School.getAverage(new int[]{3, 5, 6, 7}));

    }

    public class School{

        public static int getAverage(int[] marks){
            return (int) Arrays.stream(marks).average().orElse(Double.NaN);
        }

    }
}
