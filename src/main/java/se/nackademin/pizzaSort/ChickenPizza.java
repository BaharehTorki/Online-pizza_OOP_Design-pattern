package se.nackademin.pizzaSort;

import se.nackademin.Pizza;
import se.nackademin.PizzaAdditionalType;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ChickenPizza implements Pizza {
    final static int basePrice = 80;

    public ChickenPizza() {
        addition.forEach(addition::remove);
    }

    public ChickenPizza(List<PizzaAdditionalType> additionalTypeList) {
        addition.forEach(addition::remove);
        addition.addAll(additionalTypeList);
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
