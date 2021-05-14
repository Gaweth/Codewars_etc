package Main;

import java.util.Arrays;
import java.util.Scanner;

public class SumNumberfromOneToN {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("podaj rozmiar tablicy");
        int size=scanner.nextInt();

        int[] tab = new int[size];

        for (int i = 0; i < size; i++) {
            tab[i] = i+1;
            System.out.println(tab[i]);
        }
        System.out.println(Arrays.stream(tab).sum());


    }

        int[] tab = {1,2,3};
       // System.out.println(Arrays.stream(tab).sum());

public static void sumFromOneToN(int n){

    int result = 0;

    for (int i = 1; i <= n; i++) {
        result= result + i;


    }System.out.println(result);

    }
    }

    //1,2,3


