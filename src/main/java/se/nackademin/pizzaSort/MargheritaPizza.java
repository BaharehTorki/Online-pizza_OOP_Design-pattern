package se.nackademin.pizzaSort;

import se.nackademin.Pizza;
import se.nackademin.PizzaAdditionalType;
import se.nackademin.Utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class MargheritaPizza implements Pizza {
    private final static int basePrice = 90;
    private List<PizzaAdditionalType> addition;

    public MargheritaPizza(PizzaAdditionalType ... additionalTypeList) {
        addition = Arrays.asList(additionalTypeList);
    }
    public MargheritaPizza() {
        addition = new ArrayList<>();
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
