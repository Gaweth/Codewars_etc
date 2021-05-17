package Main;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

public class MaxAndMin {
    public static void main(String[] args) {

        int[] tab = {4,26,74,897,65,4,56,4,};

        int max = tab[0];
        int min = tab[0];

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > max){
                max = tab[i];
            }
            if (tab[i] < min) {
                min = tab[i];
            }

        }
        System.out.println("max = " + max + " and min = " + min);

        }


    }

