package se.nackademin;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AbstractPizzaFactory noneVegeFactory = PizzaProducer.getFactory(true);

        List<PizzaAdditionalType> additionalTypes = new ArrayList<>();
        additionalTypes.add(PizzaAdditionalType.CHEESE);

        Pizza chickenPizza = noneVegeFactory.getPizza(PizzaType.MARGHERITA_PIZZA, additionalTypes);

        Pizza margherita = noneVegeFactory.getPizza(PizzaType.MARGHERITA_PIZZA, additionalTypes);

        System.out.println("chickenPizza : " + chickenPizza.getPrice());
        System.out.println("margherita : " + margherita.getPrice());


    }
}
