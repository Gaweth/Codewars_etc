package Main;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LimiValue {
    public static void main(String[] args) {

        System.out.println(Kata.smallEnough(new int[]{1, 5, 3, 50, 20}, 20));
    }

    public static class Kata
    {
        public static boolean smallEnough(int[] a, int limit)
        {
            Arrays.sort(a);

            if (a[a.length - 1] > limit)
                return false;

             return true;

        }
    }
}
