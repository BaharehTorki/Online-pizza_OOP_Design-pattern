package se.nackademin;



import java.util.List;

public abstract class AbstractPizzaFactory {

    abstract Pizza getPizza(PizzaType pizzaType, List<PizzaAdditionalType> additionalTypeList) ;

}
