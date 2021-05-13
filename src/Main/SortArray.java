package Main;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortArray {
    public static void main(String[] args) {
        int[] tab = {1,3,456,13,84,64,94,564,156487,12,0};
   // Arrays.stream(tab).sorted().forEach(System.out::println);

    sort(tab);


    }


    public static void sort(int[] arr){
        Arrays.stream(arr).sorted().forEach(System.out::println);
    }
}
