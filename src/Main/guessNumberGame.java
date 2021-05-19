package Main;

import java.util.Random;
import java.util.Scanner;

public class guessNumberGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbe");
        int liczba = scanner.nextInt();
        Random random = new Random();
       int randomNumber = random.nextInt(  2);

        if (liczba==randomNumber)
            System.out.println("Twoja liczba to " + liczba +"\n"
            + "losowa liczba to = " +randomNumber + " WYGRALES ");

        else System.out.println("Twoja liczba to " + liczba +"\n"
                + "losowa liczba to = " +randomNumber + " przegrales hyhyhyhyhyhyhyhy ");


    }
}