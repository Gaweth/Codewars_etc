package sda_java_zaaw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Avg {
    public static void main(String[] args) {
       int[] tab = new int[] {1,2,3};

        System.out.println(Arrays.stream(tab).average().getAsDouble());

        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        System.out.println(avg(arrayList));
    }

    public static double avg(List<Integer> list){
        return list.stream().mapToInt(i -> i).average().getAsDouble();
    }
}
