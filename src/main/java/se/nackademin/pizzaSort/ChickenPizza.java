package se.nackademin.pizzaSort;

import se.nackademin.Pizza;
import se.nackademin.PizzaAdditionalType;
import se.nackademin.Utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ChickenPizza implements Pizza {
    private final static int basePrice = 80;
    private List<PizzaAdditionalType> addition;

    public ChickenPizza() {
        addition = new ArrayList<>();
    }

    public ChickenPizza(PizzaAdditionalType ... additionalTypeList) {

        addition = Arrays.asList(additionalTypeList);
    }

    @Override
    public int getPrice() {
        AtomicInteger totalPrice = new AtomicInteger(basePrice);

        addition.forEach(item -> {
            totalPrice.addAndGet(item.getExtraPrice());
        });
        return totalPrice.get();
    }

}
