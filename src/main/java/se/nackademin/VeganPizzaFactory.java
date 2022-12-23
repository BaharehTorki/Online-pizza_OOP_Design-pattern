package se.nackademin;

import se.nackademin.pizzaSort.MargheritaPizza;
import se.nackademin.pizzaSort.PepperoniPizza;

import java.util.List;

public class VeganPizzaFactory extends AbstractPizzaFactory {
    @Override
    protected Pizza getPizza(PizzaType pizzaType, PizzaAdditionalType ... additionalTypeList) {

        switch (pizzaType) {
            case MARGHERITA_PIZZA -> {
                return (additionalTypeList.length < 1) ?
                        new MargheritaPizza()
                        : new MargheritaPizza(additionalTypeList);
            }
            case PEPPERONI_PIZZA -> {
                return (additionalTypeList.length < 1) ?
                        new PepperoniPizza()
                        : new PepperoniPizza(additionalTypeList);
            }
            default -> throw new IllegalStateException("Unexpected value: " + pizzaType);
        }
    }


}
