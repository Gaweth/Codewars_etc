package Main;

import java.util.Arrays;

public class TwoMaxInts {
    public static void main(String[] args) {

        int[] tab = {4, 26, 74, 897, 65, 4, 56, 4,};

        Arrays.sort(tab);

        for (int tab2: tab) {
            System.out.println(tab2);
        }

        System.out.println(tab[tab.length - 1] + " and " + tab[tab.length - 2]);

        int max = tab[0];
        int min = tab[0];
        int max2 = tab[0];

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > max) {
                max = tab[i];
            }
            if (tab[i] < min){
                max = tab[i];
            }
            if (tab[i] > max - tab[i])
            {
                max2=tab[i];
            }

        }
//        System.out.println(max);
//        System.out.println(max2);
//        System.out.println(min);

        String string = "jklh";

//        StringBuilder sb = new StringBuilder(string);
//        System.out.println(sb.reverse());

        for (int i = 0; i < string.length() / 2; i++) {
            if (string.charAt(i)!=string.charAt(string.length() -i - 1))
                System.out.println("nie");
        break;

        } System.out.println(" jest");

    }
}

