package se.nackademin;

public class PizzaProducer {
    public static AbstractPizzaFactory getFactory(boolean vegan) {
        if (vegan) {
            return new VeganPizzaFactory();
        } else {
            return new PizzaFactory();
        }
    }
}
