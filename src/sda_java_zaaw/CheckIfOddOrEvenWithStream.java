package sda_java_zaaw;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CheckIfOddOrEvenWithStream {
    public static void main(String[] args) {
        ArrayList<Integer> arrays = new ArrayList<Integer>();
        arrays.add(5);
        arrays.add(10);
        arrays.add(3);
        arrays.add(7);
        arrays.add(2);
        System.out.println(checkIfEvenOrOdd(arrays));

    }

    public static List<String> checkIfEvenOrOdd(List<Integer> list){
        return list.stream().map(i -> i%2==0 ? "e "+ i : "o "+i ).collect(Collectors.toList());
    }
}
