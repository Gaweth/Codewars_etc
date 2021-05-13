package sda_java_zaaw;

import java.util.Arrays;
import java.util.Scanner;

public class addToArrayAndSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj wielkosc tablicy");
        int size = scanner.nextInt();

        int number = 0;
        int[] tab = new int[size];
        for (int i = 0; i < size; i++) {

           number = scanner.nextInt();
           tab[i] = number;

            }
        for (int i = 0; i < size; i++) {
            System.out.println(tab[i]);
        }

        System.out.println("tablica posortowana");

        Arrays.sort(tab);
        System.out.println(Arrays.toString(tab));


    }
    }