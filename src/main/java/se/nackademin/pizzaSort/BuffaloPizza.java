package se.nackademin.pizzaSort;

import se.nackademin.Pizza;
import se.nackademin.PizzaAdditionalType;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class BuffaloPizza implements Pizza {

    final static int basePrice = 70;


    public BuffaloPizza(List<PizzaAdditionalType> additionalTypeList) {
        addition.forEach(addition::remove);
        addition.addAll(additionalTypeList);
    }
    public BuffaloPizza() {
        addition.forEach(addition::remove);
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
