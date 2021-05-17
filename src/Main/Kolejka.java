package Main;

import java.util.ArrayDeque;
import java.util.Queue;

public class Kolejka {
    public static void main(String[] args) {

        Queue<Integer> queue = new ArrayDeque<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

       queue.remove(3);

       queue.add(3);


        queue.stream().forEach(System.out::println);

    }

}
