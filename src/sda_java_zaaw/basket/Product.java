package sda_java_zaaw.basket;

import java.time.LocalDate;
import java.util.Date;

public interface Product {
    Double getPriceSupplier();
    Boolean isAvaible(LocalDate date);
}
