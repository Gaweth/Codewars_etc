package sda_java_zaaw;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindAWitrhStream {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("ghjd");
        arrayList.add("ads");
        arrayList.add("26+");
        arrayList.add("SFDF");
        arrayList.add("v");
        arrayList.add("aaa");
        arrayList.add("aa");
        arrayList.add("baa");
        arrayList.add("Aaa");

        System.out.println(findA(arrayList));
    }

    public static List<String> findA(List<String> words){
        return words.stream().filter(x ->x.startsWith("a")).filter(s->s.length() == 3).collect(Collectors.toList());
    }
}
