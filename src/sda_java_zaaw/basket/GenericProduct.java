package sda_java_zaaw.basket;

import java.time.LocalDate;
import java.util.function.Function;
import java.util.function.Supplier;

public class GenericProduct implements Product{

    private Supplier<Double> priceSupplier;
    private Function<LocalDate, Boolean> availabilityFunction;

    public GenericProduct(Supplier<Double> priceSupplier, Function<LocalDate, Boolean> availabilityFunction) {
        this.priceSupplier = priceSupplier;
        this.availabilityFunction = availabilityFunction;
    }



    @Override
    public Double getPriceSupplier() {
        return priceSupplier.get();
    }

    @Override
    public Boolean isAvaible(LocalDate localDate) {
        return availabilityFunction.apply(localDate);
    }


}
