package kolekcje.zadanie1;

import java.util.ArrayList;

public class Zadanie1 {
    public static void main(String[] args) {


        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(452);
        arrayList.add(68);
        arrayList.add(78);
        arrayList.add(25);
        arrayList.remove(3);





        for (Integer lista: arrayList) {
            System.out.println(lista);
        }
        System.out.println("--------------");
        System.out.println(arrayList.get(3));
    }
}
