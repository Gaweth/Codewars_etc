package OnWingsPointsCalculator;

import java.util.Scanner;

public class Calculator {

    private int result;
    Scanner scanner = new Scanner(System.in);

    public void  cardsPoints() {
        System.out.println("podaj punkty za ptaki");
        int n = scanner.nextInt();
        int sum = 0;
        while (n != 0) {
            sum+=n;
            n = scanner.nextInt();
        }
        System.out.println(sum);



        System.out.println("podaj pkt za jajka");
        int eggs = scanner.nextInt();
        int eggPoints = eggs;
        System.out.println(eggPoints);



        System.out.println("podaj pkt za karty pod kartami");
        int cardsUnder = scanner.nextInt();
        System.out.println("podaj pkt za zywnosc");
        int food = scanner.nextInt();

        int foodAndCards = food + cardsUnder;
        System.out.println(foodAndCards);



        System.out.println("podaj pkt za cele bonusowe");
        int bonusQuest = scanner.nextInt();

        int result = sum + eggPoints + foodAndCards + bonusQuest;

        System.out.println("twoj wynik to: " + result);
    }


    }


