package Main;

import java.util.Arrays;

public class changeIndexElementInArray {
    public static void main(String[] args) {


        int[] tab = {5, 3, 3, 4, 78};

        //rozwiazanie 1

        int first = tab[0];
        int last = tab[tab.length  - 1];

        tab[0] = last;
        tab[tab.length - 1] = first;

        System.out.println("ROZWIAZANIE 1");


        for (int tab1: tab) {
            System.out.println(tab1);
        }

        System.out.println();
        System.out.println("==============");
        System.out.println();
        //rozwiazanie 2

        int[] taba = {5, 3, 3, 4, 78};

        int temp = taba[0];
        taba[0] = taba[taba.length - 1];
        taba[taba.length -1] = temp;



        System.out.println("ROZWIAZANIE 2");

        for (int tab2: taba) {
            System.out.println(tab2);
        }

        System.out.println();
        System.out.println("==============");
        System.out.println();

        //rozwiazanie 3

        int lastIndex = tab.length - 1;
        tab[0] = tab[0] + tab[lastIndex];
        tab[lastIndex]=tab[0] - tab[lastIndex];
        tab[0]=tab[0] - tab[lastIndex];






        for (int tab3: tab) {
            System.out.println(tab3);
        }
    }
}