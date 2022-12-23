package se.nackademin;

import se.nackademin.PizzaAdditionalType;

import java.util.List;

public class Utils {

    public static boolean isNullOrEmpty(List<PizzaAdditionalType> lists){
        return lists ==null || lists.isEmpty();
    }
    public static boolean makeEmpty(List<PizzaAdditionalType> lists){
        if(lists.isEmpty()) {
            return true;
        }else {
            lists.forEach(lists::remove);
            return true;
        }
    }
}
