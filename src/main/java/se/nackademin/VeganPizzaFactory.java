package se.nackademin;

import se.nackademin.pizzaSort.MargheritaPizza;
import se.nackademin.pizzaSort.PepperoniPizza;

import java.util.List;

public class VeganPizzaFactory extends AbstractPizzaFactory {
    @Override
    protected Pizza getPizza(PizzaType pizzaType, List<PizzaAdditionalType> additionalTypeList) {

        switch (pizzaType) {
            case MARGHERITA_PIZZA -> {
                return (Utils.isNullOrEmpty(additionalTypeList)) ?
                        new MargheritaPizza()
                        : new MargheritaPizza(additionalTypeList);
            }
            case PEPPERONI_PIZZA -> {
                return (Utils.isNullOrEmpty(additionalTypeList)) ?
                        new PepperoniPizza()
                        : new PepperoniPizza(additionalTypeList);
            }
            default -> throw new IllegalStateException("Unexpected value: " + pizzaType);
        }
    }


}
