package gloomhaven.cards;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GFG {


    public int getRandomElement(List<Integer> list)
    {
        Random rand = new Random();
        return list.get(rand.nextInt(list.size()));
    }

    public static Object cardsList(){
        ArrayList arrayList = new ArrayList<String>();
        arrayList.add("first");
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("x2");
        arrayList.add("PUDLO");
        arrayList.add("0");
        arrayList.add("-1");
        arrayList.add("-2");

        Random r = new Random();
       return arrayList.get(r.nextInt(arrayList.size()));

    }
}