package se.nackademin;



import se.nackademin.pizzaSort.BuffaloPizza;
import se.nackademin.pizzaSort.ChickenPizza;
import se.nackademin.pizzaSort.MeatPizza;

import java.util.List;

public class PizzaFactory extends AbstractPizzaFactory {

    @Override
    protected Pizza getPizza(PizzaType pizzaType, List<PizzaAdditionalType> additionalTypeList) {

        switch (pizzaType) {
            case BUFFALO_PIZZA -> {
                return (Utils.isNullOrEmpty(additionalTypeList)) ?
                        new BuffaloPizza()
                        : new BuffaloPizza(additionalTypeList);
            }
            case CHICKEN_PIZZA -> {
                return (Utils.isNullOrEmpty(additionalTypeList)) ?
                        new ChickenPizza()
                        : new ChickenPizza(additionalTypeList);
            }
            case MEAT_PIZZA -> {
                return (Utils.isNullOrEmpty(additionalTypeList)) ?
                        new MeatPizza()
                        : new MeatPizza(additionalTypeList);
            }

            default -> throw new IllegalStateException("Unexpected value: " + pizzaType);
        }
    }
}
