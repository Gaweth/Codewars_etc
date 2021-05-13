package butelka;

import java.util.Arrays;
import java.util.stream.IntStream;

public class dfgsg {

    class Solution {
        public static IntStream solve(int[] arr) {
           return Arrays.stream(arr).distinct();

        }

        public static void main(String[] args) {
            System.out.println(solve(new int[]{1, 2, 3, 4, 5, 5, 4}));
        }    }

}