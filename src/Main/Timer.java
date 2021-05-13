package Main;

import java.util.Scanner;

public class Timer {
    public static void main(String[] args) throws InterruptedException {
        timer();
    }

    public static void timer() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj czas do odliczenia");
        int timesOut = scanner.nextInt();

        for (int i = timesOut; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);

        }
        System.out.println("FUCK YOU");
    }
}
