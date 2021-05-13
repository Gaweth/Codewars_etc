package gloomhaven.cards;

import java.util.List;
import java.util.Random;

public class Cards {




    public static int getRandomCard(List<Integer> list) {
        Cards obj = new Cards();
        System.out.println(obj.getRandomCard(list));
        Random rand = new Random();
        return (int) list.get(rand.nextInt(list.size()));

    }
}
