package se.nackademin;


import se.nackademin.pizzaSort.BuffaloPizza;
import se.nackademin.pizzaSort.ChickenPizza;
import se.nackademin.pizzaSort.MeatPizza;

import java.util.List;

public class PizzaFactory extends AbstractPizzaFactory {

    @Override
    protected Pizza getPizza(PizzaType pizzaType, PizzaAdditionalType... additionalTypeList) {

        switch (pizzaType) {
            case BUFFALO_PIZZA -> {
                return (additionalTypeList.length < 1) ?
                        new BuffaloPizza()
                        : new BuffaloPizza(additionalTypeList);
            }
            case CHICKEN_PIZZA -> {
                return (additionalTypeList.length < 1) ?
                        new ChickenPizza()
                        : new ChickenPizza(additionalTypeList);
            }
            case MEAT_PIZZA -> {
                return (additionalTypeList.length < 1) ?
                        new MeatPizza()
                        : new MeatPizza(additionalTypeList);
            }

            default -> throw new IllegalStateException("Unexpected value: " + pizzaType);
        }
    }
}
