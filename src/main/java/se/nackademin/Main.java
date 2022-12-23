package se.nackademin;

import java.util.ArrayList;
import java.util.List;

import static se.nackademin.PizzaAdditionalType.*;

public class Main {
    public static void main(String[] args) {
        AbstractPizzaFactory vegeFactory = PizzaProducer.getFactory(true);

        Pizza pepPizza = vegeFactory.getPizza(PizzaType.PEPPERONI_PIZZA, CHEESE, MUSHROOM);

        Pizza margherita = vegeFactory.getPizza(PizzaType.MARGHERITA_PIZZA, CHEESE, BACON);

        System.out.println("pepPizza : " + pepPizza.getPrice());
        System.out.println("margherita : " + margherita.getPrice());


    }
}
