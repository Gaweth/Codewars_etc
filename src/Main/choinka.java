package Main;

import java.util.Scanner;

public class choinka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj ilosc rzedow");
        int rzedy= scanner.nextInt();


        for (int i = 0; i < rzedy; i++) {
            for (int j = 0; j < rzedy * 2; j++) {
             if (j < (rzedy - i) || j > (rzedy + i)) {
                 System.out.print(" ");
                }
             else {
                 System.out.print("*");
             }

            }
            System.out.println();
            }


            }
        }


