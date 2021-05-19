package Main;

import java.util.Arrays;

public class LargestPairSumInArray {
    public static void main(String[] args) {

    }

    public class Solution{
        public static int largestPairSum(int[] numbers){

            Arrays.sort(numbers);
            return numbers[numbers.length - 1] + numbers[numbers.length - 2] ;
        }
    }
}
