package sda_java_zaaw.basket;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       Product water = new GenericProduct(()->10.0,(date)->date.isAfter(LocalDate.now()));
       Product meat = new GenericProduct(()->25.0, (date)->true);

       Basket basket = new Basket();

       basket.add(meat);
       basket.add(water);

        List<Product> products = basket.getProcuctList();
        System.out.println(products);

        products.remove(meat);
        System.out.println(products);
        System.out.println(basket.getProcuctList());

        basket.remove(water);
        System.out.println(basket.getProcuctList());
    }
}
