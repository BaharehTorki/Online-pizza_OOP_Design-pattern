package se.nackademin;

import se.nackademin.PizzaAdditionalType;

import java.util.List;

public class Utils {

    public static boolean isNullOrEmpty(List<PizzaAdditionalType> lists){
        return lists ==null || lists.isEmpty();
    }
}
