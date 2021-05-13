package sda_java_zaaw.basket;

import java.util.ArrayList;
import java.util.List;

public class Basket  {
    private List<Product>productList = new ArrayList<>();

    public void add(Product product){

        productList.add(product);

    }
    public void remove(Product product){
        productList.remove(product);

    }
    public List<Product> getProcuctList(){
        return new ArrayList<>(productList);
        }



}

