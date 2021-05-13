package sda_java_zaaw;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ToUpperCaseWithStream {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("ghjd");
        arrayList.add("ads");
        arrayList.add("26+");
        arrayList.add("SFDF");
        arrayList.add("v");

        System.out.println(toUpperCase(arrayList));

    }

    public static List<String> toUpperCase(List<String> words){
        return words.stream().map(String::toUpperCase).collect(Collectors.toList());
    }
}
