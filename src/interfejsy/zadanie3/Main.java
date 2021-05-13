package interfejsy.zadanie3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       List<Car> arrayList = new ArrayList();
       arrayList.add(new Car("audi", "economy"));
       arrayList.add(new Car("polonez", "dgdfg"));
       arrayList.add(new Car("audi", "luxury"));


       Car car1 = new Car("audi", "economy");
       Car car2 = new Car("polonez", "dgdfg");
       Car car3 = new Car("audi", "luxury");

        System.out.println(arrayList);

       Car car = new Car("vv", "luxury");
        System.out.println(car);

        }

        }



